package com.jkdodev.todoserver.dto;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoDto {
    private int id;
    private UserDto uid;
    private GroupDto gid;
    private Instant createdTime;
    private boolean fulfilled;
    private String content;
}
