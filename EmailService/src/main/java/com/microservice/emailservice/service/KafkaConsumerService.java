package com.microservice.emailservice.service;

import com.microservice.emailservice.dto.EmailRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumerService {
    private final EmailService emailService;

    @KafkaListener(topics = "email-topic", groupId = "email-group")
    public void consumeEmail(@Payload EmailRequest request) {
        System.out.println("Email received: " + request.getTo());
    }

}
