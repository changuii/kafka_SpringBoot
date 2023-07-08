package dev.changuii.kafka_springboot_producer.Service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    private static final String TOPIC = "exam";
    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);

    @Autowired
    public KafkaProducer(
            KafkaTemplate kafkaTemplate
    ){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        logger.info("Producer Message : {}", message);
        this.kafkaTemplate.send(TOPIC, message);
    }

}
