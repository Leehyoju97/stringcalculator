package domain;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputString() {
        return scanner.nextLine();
    }
}
