package com.microservice.dbservice.service.impl;

import com.microservice.dbservice.dto.UserRequest;
import com.microservice.dbservice.entity.User;
import com.microservice.dbservice.repo.UserRepo;
import com.microservice.dbservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Override
    public String getUserData(UserRequest userRequest) {
        String name = userRequest.getName();
        String email = userRequest.getEmail();
        String password = userRequest.getPassword();
        User newUser = User.builder()
                .name(name)
                .email(email)
                .password(BCrypt.hashpw(password, BCrypt.gensalt()))
                .build();
        userRepo.save(newUser);
        return "User " + name + " registered successfully";
    }
}
