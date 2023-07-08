package dev.changuii.kafka_springboot_producer.controller;


import dev.changuii.kafka_springboot_producer.Service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class producerController {
    private final KafkaProducer kafkaProducer;

    @Autowired
    public producerController(
            KafkaProducer kafkaProducer
    ){
        this.kafkaProducer = kafkaProducer;
    }


    @PostMapping
    public HttpStatus sendMessage(@RequestParam("message") String message){

        this.kafkaProducer.sendMessage(message);
        return HttpStatus.CREATED;
    }


}
