package com.jkdodev.todoserver.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jkdodev.todoserver.entity.TodoEntity;
import com.jkdodev.todoserver.repository.TodoRepository;

@Component
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Optional<TodoEntity> getTodoDetail(int id) {
        return this.todoRepository.findById(id);
    }
}
