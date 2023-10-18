package homeworks.hw6;

public class HomeWork6Lesson {
    public static void main(String[] args) {
        // homeWorks();
        asteriskChristmasTree();
    }

    public static void asterisk() {

        char[][] twoDimArray = {{' ', ' ', ' ', ' ', '*', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', '*', ' ', '*', ' ', ' ', ' '},
                {' ', ' ', '*', ' ', '*', ' ', '*', ' ', ' '},
                {' ', '*', ' ', '*', ' ', '*', ' ', '*', ' '},
                {'*', ' ', '*', ' ', '*', ' ', '*', ' ', '*'}};
        for (char[] chars : twoDimArray) {
            for (char newChar : chars) {

                System.out.print(newChar + " ");
            }
            System.out.println();
        }
    }

    public static void asteriskChristmasTree() {
        String asterisk = "*";
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (j == i) {
                    System.out.print(asterisk);
                    asterisk += " " + "*";
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static void homeWorks() {
        String[] arrays = {"Это 1-ый урок", "Это 2-ой урок", "Это 3-ий урок"};
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
            if (arrays[i] == arrays[0]) {
                System.out.println("    Я выполнил все домашние задания 1-го урока.");
            } else if (arrays[i] == arrays[1]) {
                System.out.println("    Я выполнил все домашние задания 2-го урока.");
            } else {
                System.out.println("    Я не выполнил домашние задания 3-го урока.");

            }

        }
    }
}
/*        char a = '*';
        for (int i = 0; i < 5; i++) {
            System.out.print(a + " ");
            for (int j = 0; j < 5; j++) {
                System.out.print(a);

            }
        }*/
