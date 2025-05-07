package com.microservice.emailservice.service;

import com.microservice.emailservice.dto.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeType;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender mailSender;

    public void sendEmail(UserRequest userRequest) {
        String to = userRequest.getEmail();
        String subject = "Welcome, " + userRequest.getName();
        String body = "Hi " + userRequest.getName() + ",\n\nThank you for registering!";

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);

        mailSender.send(message);
    }
}
