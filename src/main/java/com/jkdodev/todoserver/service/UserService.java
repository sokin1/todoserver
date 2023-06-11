package com.jkdodev.todoserver.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jkdodev.todoserver.entity.UserEntity;
import com.jkdodev.todoserver.repository.UserRepository;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void addNewUser(UserEntity newUser) {
        userRepository.save(newUser);
    }

    public Optional<UserEntity> getUserDetail(int id) {
        return userRepository.findById(id);
    }
}
