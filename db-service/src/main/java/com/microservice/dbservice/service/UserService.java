package com.microservice.dbservice.service;

import com.microservice.dbservice.dto.UserRequest;

public interface UserService {
    public String getUserData(UserRequest userRequest);
}
