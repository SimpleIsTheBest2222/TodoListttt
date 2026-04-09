package com.todolist.view;

import com.todolist.domain.Todo;
import com.todolist.service.TodoService;

import java.io.Console;
import java.util.*;

public class MenuInputView {
    TodoService todoService = new TodoService();
    Scanner scanner = new Scanner(System.in);

    public String inputSelection() {
        System.out.print("선택 > _ ");
        String selection = scanner.nextLine();
        return selection;
    }

    public String[] inputCreateTodo() {
        System.out.print("> 할 일 내용 입력: ");
        String content = scanner.nextLine();
        System.out.print("> 우선순위 입력(숫자 입력): ");
        String priority = scanner.nextLine();
        return new String[]{content, priority};
    }

    public long inputDeleteTodo() {
        System.out.print("> 삭제할 항목의 ID를 입력하세요: ");
        long id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    public long inputUpdateTodo() {
        System.out.print("> 수정할 항목의 ID를 입력하세요: ");
        long id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }
}
