package dev.changuii.kafka_springboot_consumer.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);


    @KafkaListener(topics = "exam", groupId = "foo")
    public void consume(String message) throws IOException {
        logger.info("Consumed message : {}", message);
    }


}
