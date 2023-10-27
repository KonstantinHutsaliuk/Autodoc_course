package homeworks.hw11;

import java.util.Scanner;

public class HWpart3 {
    public static void main(String[] args) {
        Block();
    }

    public static void Block() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who is here?");
        String Person = scanner.nextLine();
        if (Person.equals("Admin")) {
            System.out.println("Password?");
            String password = scanner.nextLine();
            if (password.equals("I am main")) {
                System.out.println("Hello");
            } else if (password.equals("Cancel")) {
                System.out.println("Cancellation");
            } else {
                System.out.println("Wrong password");
            }

        } else if (Person.equals("Cancel")) {
            System.out.println("Cancellation");
        } else {
            System.out.println("I don't know you");
        }
    }
}
