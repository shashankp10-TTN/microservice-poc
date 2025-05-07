package com.microservice.userservice.controller;

import com.microservice.userservice.dto.EmailRequest;
import com.microservice.userservice.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {

    private final KafkaProducerService producer;

    @PostMapping("/notify")
    public ResponseEntity<String> notifyUser(@RequestBody EmailRequest request) {
        producer.sendEmail(request);
        return ResponseEntity.ok("Message sent to Kafka");
    }

//    private final RestTemplate restTemplate = new RestTemplate();


    /*
    @PostMapping("/notify")
    public Mono<String> notifyUser(@RequestBody EmailRequest emailRequest) {
//        String emailServiceUrl = "http://localhost:8080/api/v1/send";
        return webClient().post()
                .uri("/api/v1/send")
                .bodyValue(emailRequest)
                .retrieve()
                .bodyToMono(String.class);
//        String response  = restTemplate.postForObject(emailServiceUrl, emailRequest, String.class);
//        return ResponseEntity.ok(response);
    }


    public WebClient webClient() {
        return WebClient.builder().baseUrl("http://localhost:8080").build();
    }

     */
}
