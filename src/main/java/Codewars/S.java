package Codewars;

public class S {
    public static void main(String[] args) {
        evenNumbers();
    }

    public static void evenNumbers() {
        int[] arrayWithNumbers = new int[10];
        for (int i = 1; i <= arrayWithNumbers.length; i++) {
            arrayWithNumbers[i - 1] = i;
        }

        for (int i : arrayWithNumbers) {
            if (i % 2 == 0) {
                System.out.print("Y ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
