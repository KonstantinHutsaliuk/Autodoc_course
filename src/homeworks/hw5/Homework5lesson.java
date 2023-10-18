package homeworks.hw5;

public class Homework5lesson {
    public static void main(String[] args) {
       // System.out.println(lowerValue(1, 7));
        //charactersMatrix();
    }

    public static int lowerValue(int firstValue, int secondValue) {
        if (firstValue < secondValue) {
            return firstValue;
        } else {
            return secondValue;
        }
    }

    public static void charactersMatrix() {
        char[][] twoDimArray = {{'*', '*', '*', '*', '*'},
                                {'*', '*', '*', '*', '*'},
                                {'*', '*', '*', '*', '*'}};

        for (char[] chars : twoDimArray) {
            for (char newChar : chars) {
                System.out.print(newChar + " ");
            }
            System.out.println();
        }
    }
}
