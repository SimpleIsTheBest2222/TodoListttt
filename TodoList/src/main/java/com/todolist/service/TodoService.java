package com.todolist.service;

import com.todolist.common.CustomException;
import com.todolist.common.ErrorCode;
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

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo getTodo(long id) {
       Todo todo = todoRepository.findById(id);
        if (todo == null) {
            throw new CustomException(ErrorCode.TODO_NO_FOUND);
        }
        return todo;
    }

    public void updateTodo(long id, String content, int status, int priority) {
        Todo todo = todoRepository.findById(id);
        if (todo == null) {
            throw new CustomException(ErrorCode.TODO_NO_FOUND);
        }
        todo.update(status, priority, content);
    }

    public void deleteTodo(long id) {
        Todo todo = todoRepository.findById(id);
        if (todo == null) {
            throw new CustomException(ErrorCode.TODO_NO_FOUND);
        }
        todoRepository.delete(id);
    }
}