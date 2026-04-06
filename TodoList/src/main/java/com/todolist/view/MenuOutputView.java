package com.todolist.view;

public class MenuOutputView {
    public void printMainMenu() {
        System.out.print("[ To-Do List Manager ]\n" +
                        "1. 할 일 목록 보기\n" +
                        "2. 새 할 일 추가\n" +
                        "3. 할 일 수정\n" +
                        "4. 할 일 삭제\n" +
                        "5. 검색\n" +
                        "6. 종료\n");
    }


    public void printNotImplementedMessage() {
        System.out.println("[시스템] 아직 개발되지 않았습니다.\n");
    }

    public void printWrongInputMessage() {
        System.out.println("[경고] 잘못된 입력입니다. 1~5 사이의 숫자를 입력해주세요.\n");
    }
}
