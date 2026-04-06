package com.todolist.service;

import com.todolist.domain.Todo;
import com.todolist.repository.TodoRepository;

public class TodoService {
    private final TodoRepository todoRepository = new TodoRepository();

    public Todo createTodo(String content, int priority) {
        Todo todo  = new Todo(priority, content);
        todoRepository.save(todo);
        return todo;
    }

    public void updateTodo() {

    }

    public void deleteTodo() {

    }
}