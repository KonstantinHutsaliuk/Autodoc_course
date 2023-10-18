package homeworks.hw13;

public class HomeWork13Lesson {

    public static void main(String[] args) {
        happyNumber();
    }

    static void happyNumber() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i <= numbers.length; i++) {
            if (i == 3) {
                System.out.println("Вот ваше счастливое число " + i);
                break;
            }
        }
    }
}
