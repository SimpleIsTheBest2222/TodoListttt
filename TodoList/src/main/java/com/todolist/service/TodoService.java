package com.todolist.service;

import com.todolist.domain.Todo;
import com.todolist.repository.TodoRepository;

import java.util.List;

public class TodoService {
    private final TodoRepository todoRepository = new TodoRepository();

    public Todo createTodo(String content, int priority) {
        Todo todo  = new Todo(priority, content);
        todoRepository.save(todo);
        return todo;
    }

    public List<Todo> readTodo() {
        return todoRepository.findAll();
    }

    public void updateTodo() {

    }

    public void deleteTodo(long id) {
//        Todo todo = todoRepository.findById(id);
//        if(todo == null) {
//        }
        todoRepository.delete(id);
    }
}