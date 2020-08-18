package homework.romanivanov.javacore.jc10hw;

import java.util.Scanner;

public class CountText {
    public static void countText() {
        System.out.println("Type text");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        text = text.replaceAll("[,.!:;?]", "");
        String[] words = text.split("\\s");
        String count = null;
        int valueOfWords = 0;
        for (String word : words) {
            int i = 0;
            for (String word1 : words) {

                if (word.equalsIgnoreCase(word1)) {
                    i += 1;
                } else {
//                    System.out.println(word + " " + word1);
                }
            }
            if (valueOfWords < i) {
                valueOfWords = i;
                count = word;
            }
        }
        if (valueOfWords == 1) {
            System.out.println("Повторних слів нема");
        }
        System.out.println(count);
    }
}
