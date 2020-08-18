package homework.romanivanov.javacore.jc10hw;

import java.util.List;
import java.util.Scanner;

import static homework.romanivanov.javacore.jc10hw.CountSentences.countSentences;

public class CountWordSentences {
    public static void countWordsSentences() {
        System.out.println("Type text");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = text.split("[.!?]");
        System.out.println("The number of sentences in the text:" + words.length);
//        for (String word : words) {
//            List<Count> count1 = countSentences(word);
//            System.out.println(count1);
//        }


    }
}
