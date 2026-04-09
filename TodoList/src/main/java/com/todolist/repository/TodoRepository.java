package com.todolist.repository;

import com.todolist.domain.Todo;
import java.util.ArrayList;
import java.util.List;

public class TodoRepository {
    private final List<Todo> todoList = new ArrayList<>();

    public void save(Todo todo) {
        todoList.add(todo);
    }

    public List<Todo> findAll() {
        return todoList;
    }

    public void delete(long id) {
        todoList.removeIf(todo -> todo.getId() == id);
    }

    public Todo findById(long id) {
        return todoList.stream()
                .filter(todo -> todo.getId() == id)
                .findFirst()
                .orElse(null);
    }
}