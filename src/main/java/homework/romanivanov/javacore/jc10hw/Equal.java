package homework.romanivanov.javacore.jc10hw;

import java.util.Scanner;

public class Equal {
    public static void palindrom() {//1завдання
        System.out.println("Введіть слово");
        Scanner sc = new Scanner(System.in);
        StringBuffer word2 = new StringBuffer(sc.nextLine());
        StringBuffer word3 = new StringBuffer(word2);
        word2.reverse();
        String word1 = word2.toString();
        String word4 = word3.toString();
        System.out.println(word4.equalsIgnoreCase(word1));
    }
}
