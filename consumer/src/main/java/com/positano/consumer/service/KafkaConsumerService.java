package com.positano.consumer.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "test-topic", groupId = "my-group")
    public void consume(ConsumerRecord<String, String> record) {
        System.out.println("consumer receive message => " + record.value());
    }
}
