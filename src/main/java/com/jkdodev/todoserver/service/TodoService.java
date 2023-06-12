package com.jkdodev.todoserver.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jkdodev.todoserver.dto.DTOUtil;
import com.jkdodev.todoserver.dto.TodoDto;
import com.jkdodev.todoserver.entity.TodoEntity;
import com.jkdodev.todoserver.repository.TodoRepository;

@Component
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Optional<TodoEntity> getTodoDetail(int id) {
        return this.todoRepository.findById(id);
    }

    public void postNewTodo(TodoDto postTodo) {
        TodoEntity entity = DTOUtil.convertToEntity(postTodo);
        todoRepository.save(entity);
    }

    public void updateTodoMessage(TodoDto updateTodo) {
        TodoEntity entity = DTOUtil.convertToEntity(updateTodo);
        todoRepository.save(entity);
    }

    public Optional<List<TodoEntity>> getAllTodoByUser(int id) {
        return null;
    }

    public void setTodoUndone(int id) {
    }

    public void setTodoDone(int id) {
        
    }
}
