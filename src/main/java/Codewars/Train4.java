package Codewars;

//In this Kata we are passing a number (n) into a function.
//
//Your code will determine if the number passed is even (or not).
//
//The function needs to return either a true or false.
//
//Numbers may be positive or negative, integers or floats.
//
//Floats with decimal part non equal to zero are considered UNeven for this kata.
//https://www.codewars.com/kata/555a67db74814aa4ee0001b5/train/java
public class Train4 {
    public static void main(String[] args) {
        System.out.println(isEven(33.93));
    }

    public static boolean isEven(double n) {
        int a = (int) Math.round(n);
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    //best practices
    public boolean isEven1(double n) {
        return n % 2 == 0;
    }
}
