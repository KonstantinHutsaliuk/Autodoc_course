package lessons.lesson17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilMethodForCollections {
    public static void main(String[] args) {
        //  asListMethod();
       // sortMethod();
        //shuffleMethod();
       // minMaxMethod();
        frequencyMethod();
    }


    public static void frequencyMethod(){
        List<Integer> colorList = Arrays.asList(12, 43, 5, 543, 2 , 2 ,2, 3);
        System.out.println(Collections.frequency(colorList, 32));

    }
    public static void minMaxMethod(){
        List<Integer> colorList = Arrays.asList(12, 43, 5, 543, 2);
        System.out.println(Collections.max(colorList));
        System.out.println(Collections.min(colorList));
    }

    public static void shuffleMethod(){
        List<String> colorList = Arrays.asList("Желтый", "Синий", "Красный");
        Collections.shuffle(colorList);
        System.out.println("Коллекция после shuffle " + colorList);
    }
    public static void sortMethod() {
        List<String> colorList = Arrays.asList("Желтый", "Синий", "Красный");
        System.out.println("Коллекция до сортировки " + colorList);
        Collections.sort(colorList);
        System.out.println("Коллекция после сортировки " + colorList);

        colorList.sort(Collections.reverseOrder());
        System.out.println("Коллекция после reverseOrder " + colorList);

        Collections.reverse(colorList);
        System.out.println("Коллекция после reverse " + colorList);
    }

    public static void asListMethod() {
        String[] str = {"foo", "baa", "baz"};
        List<String> list = Arrays.asList(str);
        System.out.println(list);
    }
}
