package Codewars;

//It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string.
// You're given one parameter, the original string. You don't have to worry with strings with less than two characters.
public class Train3 {
    public static void main(String[] args) {
        System.out.println(remove("qwerty"));
    }

    public static String remove(String str) {
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
            } else if (i == str.length()-1) {
            } else {
                temp = temp + str.charAt(i);
            }
        }
        return temp;
    }

    //best practices
    public static String removeViaSubstring(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String removeSB(String str) {
        StringBuffer SB = new StringBuffer(str);
        SB.delete(0, 1);
        SB.delete(SB.length()-1, SB.length());
        String result = SB.toString();
        return result;
    }
}
