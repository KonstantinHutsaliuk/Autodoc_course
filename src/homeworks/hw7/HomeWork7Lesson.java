package homeworks.hw7;

public class HomeWork7Lesson {
    public static void main(String[] args) {
        int [] randomNumbers = new int [8];
        //(Math.random() * (b - a)) + a;
        //[0;100) - (Math.random() * (100 - 0)) + 0;
        //Math.random() * 100;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 100);
        }

        for (int j:randomNumbers) {
            System.out.print(j + " "); // для вывода массива данных (чтобы проверить визуально)
        }
        int temp = 0;
        for (int k : randomNumbers) {
            if (k >= temp) {
                temp = k;
            }
        }
        System.out.println();
        System.out.print(temp);
        System.out.println(toJadenCase2("fsfdsfh GGJ fbds FHDfdsf fdsfds"));
    }
    //Создать временную переменную и перезаписывать при переборе массива

 /*   public static int maxRandomNumber(){
        int [] arr = new int [8];
        //(Math.random() * (b - a)) + a;
        //[0;100) - (Math.random() * (100 - 0)) + 0;
        //Math.random() * 100;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return ;
    }*/

    public static String toJadenCase2(String phrase) {
        if (phrase == null || phrase.equals("")) {
            return null;
        } else {
            String[] b = phrase.split(" ");
            phrase = "";

            for (int i = 0; i < b.length; i++) {
                char[] arr = b[i].toCharArray();
                arr[0] = Character.toUpperCase(arr[0]);
                b[i] = String.copyValueOf(arr);
                if (i == b.length - 1) {
                    phrase = phrase.concat(b[i]);
                } else {
                    phrase = phrase.concat(b[i] + " ");
                }
            }
            return phrase;
        }
    }
}
