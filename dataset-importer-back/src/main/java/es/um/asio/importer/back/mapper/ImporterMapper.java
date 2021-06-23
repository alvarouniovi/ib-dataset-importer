package es.um.asio.importer.back.mapper;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import es.um.asio.domain.importer.ImporterSchedule;
import es.um.asio.importer.back.dto.DataImporterDTO;
import es.um.asio.importer.constants.Constants;

@Component
public class ImporterMapper {
	
    @Value("${app.data.path}")
    private String dataPath;
	
	public ImporterSchedule mapDataImporterDTOToImporterSchedule (DataImporterDTO dataImporterDTO) {
		if (dataImporterDTO == null) {
			return null;
		}
		
		ImporterSchedule importerSchedule = new ImporterSchedule();

		importerSchedule.setType(mapTypeToJobName(dataImporterDTO.getType()));
		importerSchedule.setCron(dataImporterDTO.getCron());
		importerSchedule.setUser(dataImporterDTO.getUser());
		importerSchedule.setVersion(1L);
		importerSchedule.setCreatedDate(new Date());
		importerSchedule.setParams(dataImporterDTO.getParam());
		
		return importerSchedule;
	}
	
	private String mapTypeToJobName(String type) {		
		if (type == null) {
			return null;			
		}
		
		if (type.equals("cvn")) {
			return Constants.CVN_JOB_NAME;
		}
		
		if (type.equals("dataset")) {
			return Constants.DATASET_JOB_NAME;
		}
		
		if (type.equals("oaipmh")) {
			return Constants.OAIPMH_JOB_NAME;
		}
		
		return null;
	}
}
