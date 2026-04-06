package com.todolist.view;

import com.todolist.domain.Todo;
import com.todolist.service.TodoService;

import java.util.*;

public class MenuInputView {
    TodoService todoService = new TodoService();
    Scanner scanner = new Scanner(System.in);

    public String inputSelection() {
        System.out.print("선택 > _ ");
        String selection = scanner.nextLine();
        return selection;
    }

    public Todo inputCreateTodo() {
        System.out.print("> 할 일 내용 입력: ");
        String content = scanner.nextLine();
        System.out.print("> 우선순위 입력(숫자 입력): ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        Todo todo = todoService.createTodo(content, priority);  //이 부분을 inputView가 아닌 다른 곳에서 호출하는 방법?
        return todo;
    }
}
