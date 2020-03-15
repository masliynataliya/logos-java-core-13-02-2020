package homework.romanivanov.javacore.jc10hw;

import java.util.Scanner;
public class Test {
    public static Count countSentences(String text) {
        // це мій варіант, різниця в тому, якщо маємо два слова які однаково разів повторюється,
        // на екран виводить тільки перше слово
        Count wordCounter = Count.createDefault();
        text = text.replaceAll("[,.!:;?]", "");
        String[] words = text.split("\\s");
        for (String word : words) {
            int i = 0;
            for (String word1 : words) {

                if (word.equalsIgnoreCase(word1)) {
                    i += 1;
                } else {
//                    System.out.println(word + " " + word1); перевірка слів
                }
            }
            if (wordCounter.getCountWord() < i) {
                wordCounter.setCountWord(i).setWord(word);

            }
        }
        return wordCounter;
    }
    public static void countWordsSentences(){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = text.split("[.!?]");
        for(String word:words){
            Count count1 = countSentences(word);
            System.out.println(count1);
        }



    }
}
