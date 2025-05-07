package com.microservice.dbservice.controller;


import com.microservice.dbservice.dto.UserRequest;
import com.microservice.dbservice.entity.User;
import com.microservice.dbservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/service2")
@RequiredArgsConstructor
public class RegisterDBController {

    private final UserService userService;
    private final RestTemplate restTemplate;

    @PostMapping("/add")
    public ResponseEntity<String> getUserData(@RequestBody UserRequest user) {
        try {
            String response =  userService.getUserData(user);
            String service3Url = "http://localhost:8083/api/v1/service3/mail";
            ResponseEntity<String> response1 = restTemplate.postForEntity(service3Url, user, String.class);
            return ResponseEntity.status(HttpStatus.CREATED).body(response + " Service 3 : " + response1.getBody());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }
}
