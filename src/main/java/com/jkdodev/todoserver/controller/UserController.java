package com.jkdodev.todoserver.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jkdodev.todoserver.entity.UserEntity;
import com.jkdodev.todoserver.service.UserService;

@RestController
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    private UserService userService;
    
    @GetMapping("/{id}")
    public Optional<UserEntity> getTodo(@PathVariable int id) {
        System.out.println(id);
        return userService.getUserDetail(id);
    }

    @PostMapping
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
        UserEntity newUser = new UserEntity();
        newUser.setId(UUID.randomUUID());
        newUser.setName(name);
        newUser.setEmail(email);

        userService.addNewUser(newUser);
        return "Saved";
    }
}