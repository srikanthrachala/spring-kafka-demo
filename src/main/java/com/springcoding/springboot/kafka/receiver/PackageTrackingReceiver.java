package com.springcoding.springboot.kafka.receiver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PackageTrackingReceiver {

    @KafkaListener(topics = "${spring-kafka-demo.kafka.topics.package-tracking.name}",
            groupId = "${spring-kafka-demo.kafka.topics.package-tracking.group-id}",
            id = "${spring-kafka-demo.kafka.topics.package-tracking.id}")
    public void receive(Message<String> message) {
        log.info("Message Details: {}",message);
    }
}
