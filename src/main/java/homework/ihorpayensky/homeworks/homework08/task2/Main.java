package homework.ihorpayensky.homeworks.homework08.task2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try {
            System.out.print("Введіть число: ");
            int s = new Scanner(System.in).nextInt();

            if (s%2 == 0)
                System.out.println("Це число парне");
            else
                System.out.println("Це число непарне");

        } catch (Exception e) {
            System.out.println("Error!)");
        }
    }
}
