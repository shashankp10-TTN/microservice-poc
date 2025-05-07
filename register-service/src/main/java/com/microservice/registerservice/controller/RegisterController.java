package com.microservice.registerservice.controller;

import com.microservice.registerservice.dto.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/service1")
@RequiredArgsConstructor
public class RegisterController {

    private final RestTemplate restTemplate;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserRequest user) {
        String service2Url = "http://localhost:8082/api/v1/service2/add";
        ResponseEntity<String> response = restTemplate.postForEntity(service2Url, user, String.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
    }
}
