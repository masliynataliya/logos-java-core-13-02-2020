package homework.romanivanov.javacore.jc10hw;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class CountSentences {
    public static void countSentences() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type sentence");
        String text = sc.nextLine();
        HashSet<Count> wordCounter = new HashSet<>();
        text = text.replaceAll("[,.!:;?]", "");
        String[] words = text.split("\\s");
        AtomicInteger maxWords = new AtomicInteger(0);
        for (String word : words) {
            int i = 0;
            for (String word1 : words) {

                if (word.equalsIgnoreCase(word1)) {
                    i += 1;
                } else {
//                    System.out.println(word + " " + word1);
                }

            }
            if (maxWords.get()<i){
                maxWords.addAndGet(i);
            }
            wordCounter.add(Count.createDefault().setWord(word).setCountWord(i));

        }
        System.out.println(wordCounter.stream().filter(count -> count.getCountWord() == maxWords.get() && count.getCountWord() > 1)
                .collect(Collectors.toList()));
        //stream = for; max=максимальний елемент порівнює з сусідніми елементами; orElse=звичайний else,
        //якщо не існує такого об'єкту поверне orElse
        //filter = if; count - один елемент масиву(лямбда)
        //(count -> count.getCountWord() == maxWords && count.getCountWord() > 1) лямбда вираз
        //collect запускає все це і збирає в колекцію(збірку) //List - колекція
    }
}
