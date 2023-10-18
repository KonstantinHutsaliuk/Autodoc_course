package Codewars;

import java.util.Arrays;

public class Train2 {
    public static void main(String[] args) {
        System.out.println(doubleChar("Privet"));
    }
    public static String doubleChar(String s){
        String word = "";
        for(int i = 0; i < s.length(); i++){
            word= word + s.charAt(i) + s.charAt(i);
        }
        return word;
    }
}
