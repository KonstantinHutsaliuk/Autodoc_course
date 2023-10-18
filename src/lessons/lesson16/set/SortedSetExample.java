package lessons.lesson16.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {


    public static void main(String[] args) {
        SortedSet<String> mySortedSet = new TreeSet<>();
        mySortedSet.add("C");
        mySortedSet.add("B");
        mySortedSet.add("A");
        mySortedSet.add("D");
        mySortedSet.add("R");
        mySortedSet.add("G");
        mySortedSet.add("H");
        mySortedSet.add("X");
        mySortedSet.add("Q");
        mySortedSet.add("2");
        mySortedSet.add("123");

        System.out.println(mySortedSet);


        SortedSet<Integer> mySortedSet2 = new TreeSet<>();
        mySortedSet2.add(2);
        mySortedSet2.add(123);


        System.out.println(mySortedSet2);
    }
}
