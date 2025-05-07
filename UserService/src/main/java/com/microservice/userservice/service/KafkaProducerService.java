package com.microservice.userservice.service;

import com.microservice.userservice.dto.EmailRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducerService {

    private final KafkaTemplate<String, EmailRequest> kafkaTemplate;

    private static final String TOPIC = "email-topic";

    public void sendEmail(EmailRequest emailRequest) {
        kafkaTemplate.send(TOPIC, emailRequest);
    }
}
