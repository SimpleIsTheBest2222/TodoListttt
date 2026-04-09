package com.todolist.common;

public enum ErrorCode {
    //추가 예정
    TODO_NO_FOUND("해당 ID의 할 일을 찾을 수 없습니다.");

    private final String message;

    ErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}