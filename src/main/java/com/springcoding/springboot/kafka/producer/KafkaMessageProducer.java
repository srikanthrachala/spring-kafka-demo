package com.springcoding.springboot.kafka.producer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaMessageProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void publish(String topic, String payload) {
        log.info("Topic Name: {} \t Payload: {}",topic,payload);
        kafkaTemplate.send(new ProducerRecord<>(topic, payload));
    }
}
