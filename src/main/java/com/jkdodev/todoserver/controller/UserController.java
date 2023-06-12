package com.jkdodev.todoserver.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jkdodev.todoserver.dto.UserDto;
import com.jkdodev.todoserver.entity.UserEntity;
import com.jkdodev.todoserver.service.UserService;

@RestController
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    private UserService userService;
    
    @PostMapping
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email, @RequestParam String password) {
        UserDto newUserDto = new UserDto();
        newUserDto.setName(name);
        newUserDto.setEmail(email);
        newUserDto.setPassword(password);

        userService.addNewUser(newUserDto);
        return "Saved";
    }

    @PostMapping
    public @ResponseBody Optional<UserEntity> authenticateUser(@RequestParam String email, @RequestParam String password) {
        String encodedPassword = password;
        // authenticate from firebase and get uuid

        return userService.getUserDetail(0);
    }

    @GetMapping
    public @ResponseBody String logoutUser(@PathVariable int id) {
        userService.updateLastLogin(id);
        return "Logged out";
    }
}