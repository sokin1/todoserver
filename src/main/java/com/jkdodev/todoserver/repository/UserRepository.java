package com.jkdodev.todoserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jkdodev.todoserver.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
