package homeworks.hw8;

public class HW8LessonPart2 {
    //Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно).
    // Вывести среднее арифметическое.
    public static void main(String[] args) {
        System.out.println(average());
    }

    public static double average() {
        int[] array = new int[8];
        int tempResult = 0;
        for (int i = 0; i < array.length; i++) {
            //(Math.random() * (b - a)) + a;
            array[i] = (int) ((Math.random() * 11) + 10);
        }
        for (int j : array) {
            System.out.print(j + " "); //посмотреть массив
        }
        for (int j : array) {
            tempResult += j;
        }
        System.out.println();


        return (double) tempResult / array.length;
    }
}
