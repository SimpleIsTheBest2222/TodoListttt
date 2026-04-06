package com.todolist.view;

import com.todolist.service.TodoService;

import java.util.*;

public class MenuInputView {

    Scanner scanner = new Scanner(System.in);
    TodoService todoService = new TodoService();
    MenuOutputView outputView = new MenuOutputView();

    public String inputSelection() {
        System.out.print("선택 > _ ");
        String selection = scanner.nextLine();
        return selection;
    }

    public void inputCreateTodo() {
        System.out.print("> 할 일 내용 입력: ");
        String content = scanner.nextLine();
        System.out.print("> 우선순위 입력(숫자 입력): ");
        int priority = scanner.nextInt();
        scanner.nextLine();
    }
}
