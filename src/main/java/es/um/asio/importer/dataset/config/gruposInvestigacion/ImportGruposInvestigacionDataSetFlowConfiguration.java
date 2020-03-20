package es.um.asio.importer.dataset.config.gruposInvestigacion;

import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.context.annotation.Configuration;

import es.um.asio.domain.gruposInvestigacion.ConceptoGrupo;
import es.um.asio.domain.gruposInvestigacion.ConceptoInvestigador;
import es.um.asio.domain.gruposInvestigacion.DatosContactoGrupo;
import es.um.asio.domain.gruposInvestigacion.DatosEquipoInvestigacion;
import es.um.asio.domain.gruposInvestigacion.GrupoInvestigacion;
import es.um.asio.domain.gruposInvestigacion.TipoParticipacionGrupo;
import es.um.asio.importer.dataset.config.ImportDataSetFlowConfigurationBase;

@Configuration
public class ImportGruposInvestigacionDataSetFlowConfiguration  extends ImportDataSetFlowConfigurationBase {
    
    /**
     * Genera el {@link Flow} de importacion de grupos de investigacion
     *
     * @return
     */
    @Override
    public Flow getFlow() {
        return new FlowBuilder<SimpleFlow>("importGruposInvestigacionFlow")
                .start(createStep(ConceptoGrupo.class,"dataset/Grupos de investigacion/Conceptos grupos.xml"))
                .next(createStep(ConceptoInvestigador.class,"dataset/Grupos de investigacion/Conceptos investigadores.xml"))
                .next(createStep(DatosContactoGrupo.class,"dataset/Grupos de investigacion/Datos contacto grupos.xml"))
                .next(createStep(DatosEquipoInvestigacion.class,"dataset/Grupos de investigacion/Datos equipo investigacion.xml"))
                .next(createStep(GrupoInvestigacion.class,"dataset/Grupos de investigacion/Grupos de investigacion.xml"))
                .next(createStep(TipoParticipacionGrupo.class,"dataset/Grupos de investigacion/Tipo participacion grupo.xml"))                
                .build();         
    }
}