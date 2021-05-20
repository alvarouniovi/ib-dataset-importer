package es.um.asio.importer.dataset.config.centros;

import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.context.annotation.Configuration;

import es.um.asio.domain.actividades.Actividad;
import es.um.asio.domain.actividades.FacturaEmitidaActividad;
import es.um.asio.domain.actividades.GrupoActividades;
import es.um.asio.domain.actividades.GrupoActividadesProyecto;
import es.um.asio.domain.actividades.ImpuestoRepercutidoActividad;
import es.um.asio.domain.actividades.TipoActividad;
import es.um.asio.domain.centros.Centro;
import es.um.asio.domain.centros.Departamento;
import es.um.asio.domain.centros.FechasEquiposProyectos;
import es.um.asio.importer.dataset.config.ImportDataSetFlowConfigurationBase;

/**
 * Class to generate Actividades {@link Flow}
 */
@Configuration
public class ImportCentrosDataSetFlowConfiguration extends ImportDataSetFlowConfigurationBase {
    
    /**
     * Gets the Actividades flow name.
     *
     * @return the flow name
     */
    @Override
    protected String getFlowName() {
        return "importCentrosFlow";
    }
  
    /**
     * Gets Actividades {@link Flow}
     *
     * @return the flow
     */
    @Override
    public Flow getFlow() {
        return new FlowBuilder<SimpleFlow>(getFlowName())
                .start(createStep(Centro.class,"dataset/Centros/Centros.xml"))                
                .next(createStep(Departamento.class,"dataset/Centros/Departamentos.xml"))
                .next(createStep(FechasEquiposProyectos.class,"dataset/Centros/Fechas equipos proyectos.xml"))
                .build();         
    }
}