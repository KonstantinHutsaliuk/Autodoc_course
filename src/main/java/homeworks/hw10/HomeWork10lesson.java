package homeworks.hw10;

public class HomeWork10lesson {
    public static void main(String[] args) {
        evenNumbers2();
    }

    public static void evenNumbers() {
        Integer[] arrayWithNumbers = new Integer[10];
        for (int i = 1; i <= arrayWithNumbers.length; i++) {
            arrayWithNumbers[i - 1] = i;
        }
        String[] arrayStrings = new String[10];
        for (int i = 0; i < arrayWithNumbers.length; i++) {
            if (arrayWithNumbers[i] % 2 == 0) {
                System.out.print(arrayStrings[i] = "Y ");
            } else {
                System.out.print(arrayStrings[i] = arrayWithNumbers[i].toString() + " ");
            }
        }
    }

    public static void evenNumbers2() {
        int[] arrayWithNumbers = new int[10];
        for (int i = 1; i <= arrayWithNumbers.length; i++) {
            arrayWithNumbers[i - 1] = i;
        }

        for (int i = 0; i < arrayWithNumbers.length; i++) {
            if (arrayWithNumbers[i] % 2 == 0) {
                System.out.print("Y ");
            } else {
                System.out.print(arrayWithNumbers[i] + " ");
            }
        }
    }
}
