package com.jkdodev.todoserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jkdodev.todoserver.entity.TodoEntity;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
}
