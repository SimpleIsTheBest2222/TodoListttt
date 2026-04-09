package com.todolist;

import com.todolist.common.CustomException;
import com.todolist.domain.Todo;
import com.todolist.service.TodoService;
import com.todolist.view.MenuInputView;
import com.todolist.view.MenuOutputView;
import java.util.*;

public class TodoListApplication {
    static Set<String> done_selection = Set.of("1", "2", "3", "4");
    static MenuInputView input = new MenuInputView();
    static MenuOutputView output = new MenuOutputView();
    static TodoService todoService = new TodoService();

    public static void main(String[] args) {
        while(true) {
            output.printMainMenu();
            try {
                String selection = input.inputSelection();
                if (selection.equals("6")) {
                    break;
                }
                validateSelection(selection);
            } catch (CustomException e) {
                output.printErrorMessage(e.getMessage());
            }
        }
    }

    public static void validateSelection(String selection) {

        switch (selection) {
            case "1" -> {
                isImplemented(selection);
                List<Todo> todoList = todoService.getAllTodos();
                if(todoList.isEmpty()) {
                    output.printEmptyMessage();
                } else {
                    output.printTodoList(todoList);
                }
            }
            case "2" -> {
                isImplemented(selection);
                output.printCreateMenu();
                String[] inputData = input.inputCreateTodo();
                Todo todo = todoService.createTodo(inputData[0], Integer.parseInt(inputData[1]));
                output.printCreateSuccess(todo);
            }
            case "3" -> {
                isImplemented(selection);
                output.printUpdateMenu();
                long id = input.inputUpdateTodo();
                Todo curTodo = todoService.getTodo(id);
                output.printTodo(curTodo);

                String[] updateData = input.inputUpdateData();
                todoService.updateTodo(id, updateData[0], Integer.parseInt(updateData[1]), Integer.parseInt(updateData[2]));
                output.printUpdateSuccess(id);
            }
            case "4" -> {
                isImplemented(selection);
                output.printDeleteMenu();
                long id = input.inputDeleteTodo();
                todoService.deleteTodo(id);
                output.printDeleteSuccess(id);
            }
            case "5" -> isImplemented(selection);
            default -> output.printWrongInputMessage();
        }
    }

    public static void isImplemented(String selection) {
        if (!done_selection.contains(selection)) {
            output.printNotImplementedMessage();
        }
    }
}
