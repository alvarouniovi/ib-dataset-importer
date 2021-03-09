package es.um.asio.importer.oaipmh.mapper;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import es.um.asio.domain.sgi.model.actas.ActasSGI;
import es.um.asio.domain.sgi.model.actividad.ActividadSGI;
import es.um.asio.domain.sgi.model.articuloAcademico.ArticuloAcademicoSGI;
import es.um.asio.importer.oaipmh.model.xsd.Actas;
import es.um.asio.importer.oaipmh.model.xsd.Actividad;
import es.um.asio.importer.oaipmh.model.xsd.ArticuloAcademico;

@Mapper
@DecoratedWith(OaipmhBeansMapperDecoratorImpl.class)
public interface OaipmhBeansMapper {

	@Mapping(target = "version", ignore = true)
	@Mapping(target = "entityId", ignore = true)
	ActasSGI mapperActas(Actas acta);

	@Mapping(target = "version", ignore = true)
	@Mapping(target = "entityId", ignore = true)
	ArticuloAcademicoSGI mapperArticuloAcademico(ArticuloAcademico articuloAcademico);

	@Mapping(target = "version", ignore = true)
	@Mapping(target = "entityId", ignore = true)
	ActividadSGI mapperActividad(Actividad actividad);

}
