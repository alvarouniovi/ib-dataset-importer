package es.um.asio.importer.dataset.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

import es.um.asio.domain.DataSetData;
import es.um.asio.domain.InputData;
import es.um.asio.domain.project.Project;

/**
 * Implementacion de {@link ItemWriter} para la clase {@link Project}.
 * Crea una entrada de log con cada uno de los objetos recibidos.
 */
public class DataItemWriter implements ItemWriter<InputData<DataSetData>> {
    
    /**
     * Logger
     */
	private final Logger logger = LoggerFactory.getLogger(DataItemWriter.class);
   
    /**
     * Kafka template.
     */
    @Autowired
    private KafkaTemplate<String, InputData<DataSetData>> kafkaTemplate;
    
    /**
     * Topic name
     */
    @Value("${app.kafka.input-topic-name}")
    private String topicName;

	@Override
	public void write(List<? extends InputData<DataSetData>> datas) throws Exception {
	    logger.info("Project writer called");
		
		for(InputData<DataSetData> data : datas) {
		    if(logger.isDebugEnabled()) {
		        logger.debug("Writing: {}", data);
		    }
		    
		    kafkaTemplate.send(topicName, data);
		}
	}

}
