package es.um.asio.importer.oaipmh.mapper;

import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import es.um.asio.domain.sgi.model.actas.ActasSGI;
import es.um.asio.domain.sgi.model.actividad.ActividadSGI;
import es.um.asio.domain.sgi.model.articuloAcademico.ArticuloAcademicoSGI;
import es.um.asio.importer.oaipmh.model.xsd.Actas;
import es.um.asio.importer.oaipmh.model.xsd.Actividad;
import es.um.asio.importer.oaipmh.model.xsd.ArticuloAcademico;

public abstract class OaipmhBeansMapperDecoratorImpl implements OaipmhBeansMapper {

	@Autowired
	@Qualifier("delegate")
	private OaipmhBeansMapper delegate;

	@Override
	public ActasSGI mapperActas(Actas acta) {
		if (acta == null) {
			return null;
		}

		ActasSGI actaSGI = this.delegate.mapperActas(acta);
		if (acta.getAutorCorrespondiente() != null) {
			actaSGI.setIdautorCorrespondiente(acta.getAutorCorrespondiente().getId());
		}

		if (acta.getOrganizacionCorrespondiente() != null) {
			actaSGI.setIdorganizacionCorrespondiente(acta.getOrganizacionCorrespondiente().getId());
		}

		if (acta.getPublicador() != null) {
			actaSGI.setIdpublicador(acta.getPublicador().getId());
		}

		if (acta.getTieneColeccionDePublicacion() != null) {
			actaSGI.setIdtieneColeccionDePublicacion(acta.getTieneColeccionDePublicacion().getId());
		}

		if (acta.getTieneLibroDePublicacion() != null) {
			actaSGI.setIdtieneLibroDePublicacion(acta.getTieneLibroDePublicacion().getId());
		}

		return actaSGI;
	}

	@Override
	public ActividadSGI mapperActividad(Actividad actividad) {
		if (actividad == null) {
			return null;
		}

		ActividadSGI actividadSGI = this.delegate.mapperActividad(actividad);

		if (actividad.getIntervaloDeTiempo() != null) {
			actividadSGI.setFechaFin(xmlGregorianCalendarToDate(actividad.getIntervaloDeTiempo().getFechaFin()));
			actividadSGI.setFechaInicio(xmlGregorianCalendarToDate(actividad.getIntervaloDeTiempo().getFechaInicio()));

		}

		if (actividad.getParticipaOrganizacion() != null) {
			actividadSGI.setIdparticipaOrganizacion(actividad.getParticipaOrganizacion().getId());
		}

		if (actividad.getParticipaPersona() != null) {
			actividadSGI.setIdparticipaPersona(actividad.getParticipaPersona().getId());
		}

		if (actividad.getSeRelacionaGasto() != null) {
			actividadSGI.setIdseRelacionaGasto(actividad.getSeRelacionaGasto().getId());
		}

		if (actividad.getLocalizadoEn() != null) {
			actividadSGI.setIdlocalizadoEn(actividad.getLocalizadoEn().getId());
		}

		if (actividad.getSeRelacionaRol() != null) {
			actividadSGI.setIdseRelacionaRol(actividad.getSeRelacionaRol().getId());
		}

		return actividadSGI;
	}

	@Override
	public ArticuloAcademicoSGI mapperArticuloAcademico(ArticuloAcademico articuloAcademico) {
		if (articuloAcademico == null) {
			return null;
		}

		ArticuloAcademicoSGI articuloAcademicoSGI = this.delegate.mapperArticuloAcademico(articuloAcademico);
		if (articuloAcademico.getAutorCorrespondiente() != null) {
			articuloAcademicoSGI.setIdautorCorrespondiente(articuloAcademico.getAutorCorrespondiente().getId());
		}

		if (articuloAcademico.getOrganizacionCorrespondiente() != null) {
			articuloAcademicoSGI
					.setIdorganizacionCorrespondiente(articuloAcademico.getOrganizacionCorrespondiente().getId());
		}

		if (articuloAcademico.getPublicadoEnPublicacionImpacto() != null) {
			articuloAcademicoSGI
					.setIdpublicadoEnPublicacionImpacto(articuloAcademico.getPublicadoEnPublicacionImpacto().getId());
		}

		if (articuloAcademico.getTieneColeccionDePublicacion() != null) {
			articuloAcademicoSGI
					.setIdtieneColeccionDePublicacion(articuloAcademico.getTieneColeccionDePublicacion().getId());
		}

		if (articuloAcademico.getTieneLibroDePublicacion() != null) {
			articuloAcademicoSGI.setIdtieneLibroDePublicacion(articuloAcademico.getTieneLibroDePublicacion().getId());
		}

		if (articuloAcademico.getTieneMetrica() != null) {
			articuloAcademicoSGI.setIdtieneMetrica(articuloAcademico.getTieneMetrica().getId());
		}

		return articuloAcademicoSGI;
	}

	private static Date xmlGregorianCalendarToDate(XMLGregorianCalendar xcal) {
		if (xcal == null) {
			return null;
		}

		return xcal.toGregorianCalendar().getTime();
	}

}
