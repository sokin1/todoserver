package com.jkdodev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jkdodev.dto.TodoDto;
import com.jkdodev.repository.TodoRepository;

import lombok.NonNull;

@Component
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public TodoDto getTodoDetail(@NonNull int id) {
        return this.todoRepository.findTodoById(id);
    }
}
