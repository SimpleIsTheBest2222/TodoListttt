package com.todolist.view;

import java.util.*;

public class MenuInputView {

    Scanner scanner = new Scanner(System.in);

    public String inputSelection() {
        System.out.print("선택 > _ ");
        String selection = scanner.nextLine();
        return selection;
    }

}
