package es.um.asio.importer.oaipmh.processor;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Node;

import es.um.asio.abstractions.perfomance.WatchDog;
import es.um.asio.domain.DataSetData;
import es.um.asio.domain.InputData;
import es.um.asio.domain.sgi.model.actas.ActasSGI;
import es.um.asio.domain.sgi.model.actas.RelActasAutores;
import es.um.asio.domain.sgi.model.articuloAcademico.ArticuloAcademicoSGI;
import es.um.asio.domain.sgi.model.articuloAcademico.RelArticuloAcademicoAutor;
import es.um.asio.importer.constants.Constants;
import es.um.asio.importer.oaipmh.mapper.OaipmhBeansMapper;
import es.um.asio.importer.oaipmh.model.HeaderType;
import es.um.asio.importer.oaipmh.model.OAIPMHtype;
import es.um.asio.importer.oaipmh.model.SetType;
import es.um.asio.importer.oaipmh.model.xsd.Actas;
import es.um.asio.importer.oaipmh.model.xsd.Actas.ListaDeAutores.Autor;
import es.um.asio.importer.oaipmh.model.xsd.ArticuloAcademico;
import es.um.asio.importer.oaipmh.model.xsd.ObjectFactory;
import es.um.asio.importer.oaipmh.writer.OaipmhWriter;

public class DataOaipmhProcessor implements Tasklet {

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(DataOaipmhProcessor.class);

	/**
	 * The job execution id.
	 */
	private long jobExecutionId;

	private RestTemplate restTemplate;

	@Autowired
	private OaipmhWriter dataService;

	@Autowired
	private OaipmhBeansMapper mapper;

	@Value("${app.data.path}")
	private String dataPath;

	/** The SGI factory endpoint. */
	@Value("${app.services.oai.endpoint-list}")
	private String uriFactoryEndpointList;

	/** The SGI factory endpoint. */
	@Value("${app.services.oai.endpoint-ids}")
	private String uriFactoryEndpointIds;

	/** The uri factory endpoint. */
	@Value("${app.services.oai.endpoint-xml}")
	private String uriFactoryEndpointXml;

	/**
	 * @inheritDoc
	 */
	@BeforeStep
	public void beforeStep(StepExecution stepExecution) {
		jobExecutionId = stepExecution.getJobExecutionId();
	}

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		WatchDog eventNotifyWatchDog = new WatchDog();
		ResponseEntity<OAIPMHtype> responseIds = null;
		ResponseEntity<OAIPMHtype> responseXml = null;
		List<InputData<DataSetData>> list = new ArrayList<InputData<DataSetData>>();

		try {
			restTemplate = new RestTemplate();
			ResponseEntity<OAIPMHtype> response = restTemplate.getForEntity(uriFactoryEndpointList, OAIPMHtype.class);

			if (response.getBody() != null && response.getBody().getListSets() != null) {

				for (SetType set : response.getBody().getListSets().getSet()) {
					try {
						responseIds = restTemplate.getForEntity(uriFactoryEndpointIds.concat(set.getSetSpec()),
								OAIPMHtype.class);
					} catch (Exception e) {
						logger.error(e.getMessage());
					}
					if (responseIds != null && responseIds.getBody().getError().size() != 0) {
						logger.debug(responseIds.getBody().getError().get(0).getValue() + " - URL: "
								+ uriFactoryEndpointIds.concat(set.getSetSpec()));
					} else {
						for (HeaderType setID : responseIds.getBody().getListIdentifiers().getHeader()) {
							logger.info("Spec: " + set.getSetSpec() + ", ID: " + setID.getIdentifier());
							try {
								responseXml = restTemplate.getForEntity(
										uriFactoryEndpointXml.concat(setID.getIdentifier()), OAIPMHtype.class);
							} catch (Exception e) {
								logger.error(e.getMessage());
							}
							if (responseXml == null || responseXml.getBody().getError().size() != 0) {
								logger.debug(responseXml.getBody().getError().get(0).getValue() + " - URL: "
										+ uriFactoryEndpointXml.concat(setID.getIdentifier()));
							} else if (responseXml != null) {

								if (responseXml.getBody().getIdentify() != null
										&& responseXml.getBody().getIdentify().getDeletedRecord() != null) {
									// TODO DELETE
									System.out.println("DELETEEEEEEEE");
								} else {

									mappingObjects(list, responseXml, set.getSetSpec());

								}
							}
						}
					}
				}
			} else {
				logger.info("nothing on response SGI");
			}

			eventNotifyWatchDog.takeTime("eventNotify");

		} catch (Exception e) {
			logger.error(e.getMessage());
		}

		dataService.write(list);

		// we print the watchdog results
		logger.warn("-----------------------------------------------------------------------");
		eventNotifyWatchDog.printnResults(logger);
		logger.warn("-----------------------------------------------------------------------");

		return RepeatStatus.FINISHED;
	}

	private void mappingObjects(List<InputData<DataSetData>> list, ResponseEntity<OAIPMHtype> responseXml,
			String setSpec) {
		List<InputData<DataSetData>> listActas = null;
		switch (setSpec) {
		case Constants.ACTAS:
			listActas = mappingActas(responseXml);
			if (listActas != null && listActas.size() != 0)
				list.addAll(listActas);
			break;

		case Constants.ARTICULO_ACADEMICO:
			listActas = mappingArticuloAcademico(responseXml);
			if (listActas != null && listActas.size() != 0)
				list.addAll(listActas);
			break;
		}

	}

	private List<InputData<DataSetData>> mappingArticuloAcademico(ResponseEntity<OAIPMHtype> responseXml) {
		List<InputData<DataSetData>> listActas = new ArrayList<>();
		InputData<DataSetData> data;
		RelArticuloAcademicoAutor relArticuloAcademicoAutor = null;
		DataSetData domain = null;
		Object articuloAcadElement = responseXml.getBody().getGetRecord().getRecord().getMetadata().getAny();

		JAXBContext context;
		try {
			context = JAXBContext.newInstance("es.um.asio.importer.oaipmh.model.xsd",
					ArticuloAcademico.class.getClassLoader());
			Unmarshaller um;

			um = context.createUnmarshaller();

			ArticuloAcademico articuloAcademico;

			articuloAcademico = (ArticuloAcademico) um.unmarshal((Node) articuloAcadElement);

			logger.debug("response: " + articuloAcademico.toString());

			domain = new ArticuloAcademicoSGI();
			domain.setVersion(jobExecutionId);
			data = new InputData<DataSetData>();

			ArticuloAcademicoSGI articuloAcadSgi = this.mapper.mapperArticuloAcademico(articuloAcademico);
			articuloAcadSgi.setId(responseXml.getBody().getGetRecord().getRecord().getHeader().getIdentifier());

			domain = articuloAcadSgi;
			data.setData(domain);
			logger.info("Processing DataSetData {}", domain.getClass());
			listActas.add(data);

			if (articuloAcademico.getListaDeAutores() != null
					&& articuloAcademico.getListaDeAutores().getAutor() != null) {
				for (es.um.asio.importer.oaipmh.model.xsd.ArticuloAcademico.ListaDeAutores.Autor autor : articuloAcademico
						.getListaDeAutores().getAutor()) {
					domain = new RelArticuloAcademicoAutor();
					data = new InputData<DataSetData>();
					relArticuloAcademicoAutor = new RelArticuloAcademicoAutor();
					relArticuloAcademicoAutor.setIdArticuloAcademico(articuloAcadSgi.getId());
					relArticuloAcademicoAutor.setIdAutor(autor.getId());
					domain = relArticuloAcademicoAutor;
					domain.setVersion(jobExecutionId);
					data.setData(domain);
					logger.info("Processing DataSetData {}", domain.getClass());
					listActas.add(data);
				}
			}

		} catch (JAXBException e) {
			logger.error(e.getMessage());

		}

		return listActas;
	}

	private List<InputData<DataSetData>> mappingActas(ResponseEntity<OAIPMHtype> responseXml) {
		List<InputData<DataSetData>> listActas = new ArrayList<>();
		InputData<DataSetData> data;
		RelActasAutores relActaAutor = null;
		DataSetData domain = null;

		Object actaElement = responseXml.getBody().getGetRecord().getRecord().getMetadata().getAny();

		JAXBContext context;
		try {
			context = JAXBContext.newInstance(ObjectFactory.class.getPackage().getName());
			Unmarshaller um;

			um = context.createUnmarshaller();

			Actas acta;

			acta = (Actas) um.unmarshal((Node) actaElement);

			logger.debug("response: " + acta.toString());

			domain = new ActasSGI();
			domain.setVersion(jobExecutionId);
			data = new InputData<DataSetData>();

			ActasSGI actaSgi = this.mapper.mapperActas(acta);
			actaSgi.setId(responseXml.getBody().getGetRecord().getRecord().getHeader().getIdentifier());

			domain = actaSgi;
			data.setData(domain);
			logger.info("Processing DataSetData {}", domain.getClass());
			listActas.add(data);

			if (acta.getListaDeAutores() != null && acta.getListaDeAutores().getAutor() != null) {
				for (Autor autor : acta.getListaDeAutores().getAutor()) {
					domain = new RelActasAutores();
					data = new InputData<DataSetData>();
					relActaAutor = new RelActasAutores();
					relActaAutor.setIdActas(actaSgi.getId());
					relActaAutor.setIdAutor(autor.getId());
					domain = relActaAutor;
					domain.setVersion(jobExecutionId);
					data.setData(domain);
					logger.info("Processing DataSetData {}", domain.getClass());
					listActas.add(data);
				}
			}

		} catch (JAXBException e) {
			logger.error(e.getMessage());

		}

		return listActas;
	}

}
