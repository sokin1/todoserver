package com.jkdodev.repository;

import org.springframework.stereotype.Repository;

import com.jkdodev.dto.TodoDto;

import lombok.NonNull;

@Repository
public class TodoRepository {
    
    public TodoDto findTodoById(@NonNull int id) {
        return new TodoDto();
    }
}
