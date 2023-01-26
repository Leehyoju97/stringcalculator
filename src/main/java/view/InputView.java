package view;

import domain.Input;

public class InputView {
    private static final String INPUT_MESSAGE = "계산식을 입력해주세요 : ";

    public static String showInputMessage() {
        System.out.print(INPUT_MESSAGE);
        return Input.inputString();
    }
}
