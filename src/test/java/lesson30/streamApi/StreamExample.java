package lesson30.streamApi;

import Codewars.S;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
      //  reducing();

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("two");

        for (String e : list) {
            //    System.out.println(e);
        }

        Stream<String> stream = list.stream();
        //  stream.forEach(System.out::println);

        Set<String> stringSet = list.stream().collect(Collectors.toSet());
        //    stringSet.forEach(System.out::println);

        Set<String> filterSet = list.stream().filter(x -> x.equals("one")).collect(Collectors.toSet());
        // filterSet.forEach(System.out::println);

        List<String> upperList = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        //  upperList.forEach(System.out::println);

        Stream<String> stream1 = Stream.of("one", "two");

        List<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");

        List<String> list2 = new ArrayList<>();
        list2.add("three");
        list2.add("four");

        Set<List<String>> stringsSet1 = Stream.of(List.of(list1), List.of(list2)).flatMap(x -> x.stream())
                .collect(Collectors.toSet());
        //     stringsSet1.forEach(System.out::println);

        int streamReducing = Stream.of(1, 2, 3).reduce(0, (count, element) -> count + element);
      //  System.out.println(streamReducing);

        Stream.of("one", "two").sorted();
        Stream.of("one", "two").limit(1);
        Stream.of("one", "two", "two").distinct();//убирает дубликаты
        Stream.of("one", "two").skip(1);

    }

    public static void reducing() {
        int count = 0;
        int[] arr = {1, 2, 3};
        for (int a : arr) {
            count += a;
        }
        System.out.println(count);
    }
}
