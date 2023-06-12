package com.jkdodev.todoserver.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jkdodev.todoserver.dto.TodoDto;
import com.jkdodev.todoserver.entity.TodoEntity;
import com.jkdodev.todoserver.service.TodoService;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;
    
    @GetMapping("/{id}")
    public Optional<TodoEntity> getTodo(@PathVariable int id) {
        return todoService.getTodoDetail(id);
    }

    @PostMapping
    public void postTodo(@RequestParam TodoDto postTodo) {
        todoService.postNewTodo(postTodo);
    }

    @PutMapping
    public void updateTodoMessage(@RequestParam TodoDto updateTodo) {
        todoService.updateTodoMessage(updateTodo);
    }

    @GetMapping("/user/{id}")
    public Optional<List<TodoEntity>> getAllTodoByUser(@PathVariable int id) {
        return todoService.getAllTodoByUser(id);
    }

    @PutMapping("/{id}/done")
    public void setTodoDone(@PathVariable int id) {
        todoService.setTodoDone(id);
    }

    @PutMapping("/{id}/undone")
    public void setTodoUndone(@PathVariable int id) {
        todoService.setTodoUndone(id);
    }
}