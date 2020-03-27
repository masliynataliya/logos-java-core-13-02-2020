package homework.romanivanov.javacore.jc10hw;

import java.util.Scanner;

public class Equal {
    public static void equal() {//1завдання
        System.out.println("Введіть слово");
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
}
