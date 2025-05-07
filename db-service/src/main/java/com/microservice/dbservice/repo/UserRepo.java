package com.microservice.dbservice.repo;

import com.microservice.dbservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
