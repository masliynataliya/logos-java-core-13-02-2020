package homework.romanivanov.javacore.jc10hw;

import java.util.Scanner;

public class CountSentences {
    public static void countSentences() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type sentence");
        String text = sc.nextLine();
        text = text.replaceAll("[,.!:;?]", " ");
        String[] words = text.split("\\s");
        int maxWords = 0;
        String word = null;
        for (String value : words) {
            int maxCount = 0;
            String word2 = null;
            for (String s : words) {
                if (value.equals(s)) {
                    maxCount++;
                    word2 = value;
                }
            }
            if (maxWords < maxCount) {
                maxWords = maxCount;
                word = word2;
            }
        }
        System.out.println("Слово яке найчастіше зустрічається - " + word + " Зустрічається стільки раз -" + maxWords);

    }
}


    //stream = for; max=максимальний елемент порівнює з сусідніми елементами; orElse=звичайний else,
            //якщо не існує такого об'єкту поверне orElse
            //filter = if; count - один елемент масиву(лямбда)
            //(count -> count.getCountWord() == maxWords && count.getCountWord() > 1) лямбда вираз
            //collect запускає все це і збирає в колекцію(збірку) //List - колекція


