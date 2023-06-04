package com.jkdodev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jkdodev.dto.TodoDto;
import com.jkdodev.service.TodoService;

@RestController
@RequestMapping("todo")
public class TodoController {

    @Autowired
    private TodoService todoService;
    
    @GetMapping("/{id}")
    public TodoDto getTodo(@PathVariable int id) {
        return todoService.getTodoDetail(id);
    }
}