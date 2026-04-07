package com.todolist.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class Todo {
    private final Map<Integer, String> TODO_STATUS = Map.of(1, "시작 전", 2, "진행중", 3, "완료");
    private static long sequence = 1;

    private final long id;
    private String status;
    private int priority;
    private String content;
    private LocalDateTime createdAt;

    public Todo(int priority, String content) {
        this.id = sequence++;
        this.status = TODO_STATUS.get(1);
        this.priority = priority;
        this.content = content;
        this.createdAt = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public int getPriority() {
        return priority;
    }

    public String getContent() {
        return content;
    }

    public String getCreatedAt() {
        return createdAt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = LocalDateTime.now();
    }
}