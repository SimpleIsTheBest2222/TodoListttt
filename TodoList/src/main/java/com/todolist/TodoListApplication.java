package com.todolist;

import com.todolist.view.MenuInputView;
import com.todolist.view.MenuOutputView;
import java.util.*;

public class TodoListApplication {

    static Set<String> done_selection = new HashSet<>();
    static  MenuInputView input = new MenuInputView();
    static MenuOutputView output = new MenuOutputView();

    public static void main(String[] args) {
        while(true) {
            output.printMainMenu();
            String selection = input.inputSelection();
            if (selection.equals("6")) {
                break;
            }
            validateSelection(selection);
        }
    }

    public static void validateSelection(String selection) {

        /*todo crud 추가 예정 */
        switch (selection) {
            case "1" -> isImplemented(selection);
            case "2" -> isImplemented(selection);
            case "3" -> isImplemented(selection);
            case "4" -> isImplemented(selection);
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
