package homeworks.hw11;

import java.util.Scanner;

public class HomeWork11Lesson {
    public static void main(String[] args) {
        int fromConsole = getInt();
        int fromConsole2 = getInt();
        char operation = getOperation();
        int result = calc(fromConsole, fromConsole2, operation);
        System.out.println("Ваш результат:  " + result);
    }

    private static int calc(int fromConsole, int fromConsole2, char operation) {
        int result = 0;
        if (operation == '-' || operation == '+' || operation == '/' || operation == '*') {
            switch (operation) {
                case '-' -> result = fromConsole - fromConsole2;
                case '+' -> result = fromConsole + fromConsole2;
                case '/' -> result = fromConsole / fromConsole2;
                case '*' -> result = fromConsole * fromConsole2;

            }
            ;
        } else {
            System.out.println("Вы ввели неверный символ");
        }
        return result;
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        return scanner.nextInt();
    }

    private static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите один из символов: + - * /");
        return scanner.nextLine().charAt(0);
    }
}
