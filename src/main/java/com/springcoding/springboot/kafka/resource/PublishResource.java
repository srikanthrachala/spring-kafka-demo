package com.springcoding.springboot.kafka.resource;

import com.springcoding.springboot.kafka.producer.KafkaMessageProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@Slf4j
@RestController
@RequestMapping("/kafka/topics/{topicName}")
public class PublishResource {

    @Autowired
    KafkaMessageProducer kafkaMessageProducer;

    @PostMapping("/messages")
    public String publish(@PathVariable String topicName, @RequestBody String payload) {
        log.info("Topic Name: {} \t Payload: {}",topicName,payload);
        kafkaMessageProducer.publish(topicName, payload);
        return "Message Published";
    }
}
