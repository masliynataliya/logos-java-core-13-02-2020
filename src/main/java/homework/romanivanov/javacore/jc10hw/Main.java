package homework.romanivanov.javacore.jc10hw;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        countWordsSentences();
        countText();
        count();
        replace();
        equal();


    }

    public static void equal() {//1завдання
        Scanner sc = new Scanner(System.in);
        StringBuffer word2 = new StringBuffer(sc.nextLine());
        StringBuffer word3 = new StringBuffer(word2);
        String word1 = word2.toString();
        String word4 = word3.toString();


        word2.reverse();
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word4.toUpperCase().equals(word1.toUpperCase()));
    }

    public static void replace() {
        Scanner sc = new Scanner(System.in);
        StringBuffer text = new StringBuffer(sc.nextLine());
        String text1 = text.toString();
        System.out.println(text1.length());
        System.out.println(text);
        System.out.println(text1.replaceAll("[aiyuoe]", "-"));//2 завдання
    }

    public static void count() {
        Scanner sc = new Scanner(System.in);
        StringBuffer countText = new StringBuffer(sc.nextLine());
        String countText1 = countText.toString();
        String[] number = countText1.split(" ");// 3 кількість слів в реченні
        System.out.println(number.length);
        String[] sentences = countText1.split("\\S+");//кількість речень в тексті S+//всі розділові значення
        System.out.println(sentences.length);
    }

    public static void countText() {
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
//                    System.out.println(word + " " + word1); перевірка слів
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

    public static List<Count> countSentences(String text) {
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
//                    System.out.println(word + " " + word1); перевірка слів
                }

            }
            if (maxWords.get()<i){
                maxWords.addAndGet(i);
            }
            wordCounter.add(Count.createDefault().setWord(word).setCountWord(i));


        }
        //stream = for; max=максимальний елемент порівнює з сусідніми елементами; orElse=звичайний else,
        //якщо не існує такого об'єкту поверне orElse
        return wordCounter.stream().filter(count -> count.getCountWord() == maxWords.get() && count.getCountWord() > 1)
                .collect(Collectors.toList());
        //filter = if; count - один елемент масиву(лямбда)
        //(count -> count.getCountWord() == maxWords && count.getCountWord() > 1) лямбда вираз
        //collect запускає все це і збирає в колекцію(збірку) //List - колекція
    }

    public static void countWordsSentences() {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = text.split("[.!?]");
        for (String word : words) {
            List<Count> count1 = countSentences(word);
            System.out.println(count1);
        }


    }
}












