package Codewars;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int smallest = Integer.MAX_VALUE;
        for (int i : args)
            smallest = (smallest > i) ? i : smallest;
        return smallest;
    }

    public static void main(String[] args) {
        int[] a = {4, 6, -2, 55, -1111};
        System.out.println(findSmallestInt(a));
    }
}
