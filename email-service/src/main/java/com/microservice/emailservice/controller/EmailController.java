package com.microservice.emailservice.controller;

import com.microservice.emailservice.dto.UserRequest;
import com.microservice.emailservice.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/service3")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @PostMapping("/mail")
    public ResponseEntity<String> sendEmail(@RequestBody UserRequest userRequest) {
        emailService.sendEmail(userRequest);
        return new ResponseEntity<>("Email sent successfully", HttpStatus.OK);
    }
}
