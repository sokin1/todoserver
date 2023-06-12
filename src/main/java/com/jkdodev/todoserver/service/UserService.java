package com.jkdodev.todoserver.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jkdodev.todoserver.dto.DTOUtil;
import com.jkdodev.todoserver.dto.UserDto;
import com.jkdodev.todoserver.entity.UserEntity;
import com.jkdodev.todoserver.repository.UserRepository;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void addNewUser(UserDto userDto) {
        UserEntity userEntity = DTOUtil.convertToEntity(userDto);
        userRepository.save(userEntity);
    }

    public Optional<UserEntity> getUserDetail(int id) {
        return userRepository.findById(id);
    }

    public void updateLastLogin(int id) {
        Optional<UserEntity> user = userRepository.findById(id);
        if (user.isPresent()) {
            UserEntity updateUser = user.get();
            updateUser.setLastActive(LocalDateTime.now());
            userRepository.save(updateUser);
        }
        
    }
}
