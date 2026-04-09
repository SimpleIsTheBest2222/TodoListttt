package com.todolist.view;

import com.todolist.domain.Todo;

import java.util.List;

public class MenuOutputView {
    static  MenuInputView input = new MenuInputView();

    public void printMainMenu() {
        System.out.print("[ To-Do List Manager ]\n" +
                        "1. 할 일 목록 보기\n" +
                        "2. 새 할 일 추가\n" +
                        "3. 할 일 수정\n" +
                        "4. 할 일 삭제\n" +
                        "5. 검색\n" +
                        "6. 종료\n");
    }

    public void printCreateMenu() {
        System.out.print("""
                [ 새 할 일 추가 ]
                ---------------------------------------------------------
                """);
    }

    public void printCreateSuccess(Todo todo) {
        System.out.println("""
                ---------------------------------------------------------
                [시스템] "%s" 항목이 추가되었습니다!
                (생성 시간: %s)
                ---------------------------------------------------------
                """.formatted(todo.getContent(), todo.getCreatedAt()));
    }

    public void printTodoList(List<Todo> todoList) {
        System.out.print("""
                =============================================================================================
                 ID |   상태   | 우선순위 |      생성 일시     |  할 일 내용
                ---------------------------------------------------------------------------------------------
                """);
        for (Todo todo : todoList) {
            System.out.printf(" %02d | [%s] |   %d   | %s | %s\n",
                    todo.getId(),
                    todo.getStatus(),
                    todo.getPriority(),
                    todo.getCreatedAt(),
                    todo.getContent());
        }
        System.out.println("""
                ---------------------------------------------------------------------------------------------
                [ 총 "%d"개의 항목이 있습니다. ]
                =============================================================================================
                """.formatted(todoList.size()));
    }

    public void printDeleteMenu() {
        System.out.print("""
                [ 할 일 삭제 ]
                ---------------------------------------------------------
                """);
    }

    public void printDeleteSuccess(long id) {
        System.out.printf("[시스템] ID %02d번 항목의 정보가 성공적으로 삭제되었습니다.%n%n", id);
    }

    public void printUpdateMenu() {
        System.out.print("""
                [ 할 일 수정 ]
                ---------------------------------------------------------
                """);
    }

    public void printTodo(Todo todo) {
        System.out.printf("""
                [현재 데이터]
                - 내용: %s
                - 상태: %s
                - 우선순위: %d
                """, todo.getContent(), todo.getStatus(), todo.getPriority());
    }

    public void printNotImplementedMessage() {
        System.out.println("[시스템] 아직 개발되지 않았습니다.\n");
    }

    public void printWrongInputMessage() {
        System.out.println("[경고] 잘못된 입력입니다. 1~6 사이의 숫자를 입력해주세요.\n");
    }

    public void printEmptyMessage() {
        System.out.println("현재 등록된 할 일이 없습니다.\n");
    }

    public void printErrorMessage(String message) {
        System.out.println(message);
    }
}