package homework.romanivanov.javacore.jc10hw;

import java.util.Scanner;

public class Count01 {
    public static void count() {
        System.out.println("Введіть речення");
        Scanner sc = new Scanner(System.in);
        StringBuffer countText = new StringBuffer(sc.nextLine());
        String countText1 = countText.toString();
        String[] number = countText1.split(" ");// 3 кількість слів в реченні
        System.out.println(number.length);
        String[] sentences = countText1.split("\\S+");//кількість речень в тексті S+//всі розділові значення
        System.out.println(sentences.length);
    }
}
