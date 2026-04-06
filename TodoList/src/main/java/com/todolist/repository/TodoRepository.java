package com.todolist.repository;

import com.todolist.domain.Todo;
import java.util.ArrayList;
import java.util.List;

public class TodoRepository {
    private final List<Todo> todoList = new ArrayList<>();

    public Todo save(Todo todo) {
        todoList.add(todo);
        return todo;
    }

    public void findAll() {

    }

    public void findById() {

    }
}