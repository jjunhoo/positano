package com.positano.internal.controller.kafka.controller;

import com.positano.internal.controller.kafka.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kafka")
public class KafkaProducerController {

    private final KafkaProducerService producerService;

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        producerService.sendMessage("test-topic", message);
        return "Message sent: " + message;
    }

}
