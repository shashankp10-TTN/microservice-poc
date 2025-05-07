package com.microservice.emailservice.controller;

import com.microservice.emailservice.dto.EmailRequest;
import com.microservice.emailservice.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/send")
public class EmailController {

    private final EmailService emailService;

    @PostMapping
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest emailRequest) {
        System.out.println("Sending email....");
        emailService.createEmail(emailRequest.getTo(), emailRequest.getMessage());
        return ResponseEntity.ok("Email sent");
    }
}
