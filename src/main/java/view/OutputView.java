package view;

public class OutputView {
    private static final String RESULT_MESSAGE = "결과 : ";
    private static final String END_MESSAGE = "계산기 프로그램을 종료합니다..";

    public static void showOutputMessage(int result) {
        System.out.println(RESULT_MESSAGE + result);
        System.out.println(END_MESSAGE);
    }
}
