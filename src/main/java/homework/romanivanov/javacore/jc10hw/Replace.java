package homework.romanivanov.javacore.jc10hw;

import java.util.Scanner;

public class Replace {
    public static void replace() {
        System.out.println("Введіть текст");
        Scanner sc = new Scanner(System.in);
        StringBuffer text = new StringBuffer(sc.nextLine());
        String text1 = text.toString();
        System.out.println(text1.length());
        System.out.println(text);
        System.out.println(text1.replaceAll("[aiyuoe]", "-"));//2 завдання
    }
}
