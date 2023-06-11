package com.jkdodev.todoserver.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jkdodev.todoserver.entity.TodoEntity;
import com.jkdodev.todoserver.service.TodoService;

@RestController
@RequestMapping("todo")
public class TodoController {

    @Autowired
    private TodoService todoService;
    
    @GetMapping("/{id}")
    public Optional<TodoEntity> getTodo(@PathVariable int id) {
        return todoService.getTodoDetail(id);
    }
}