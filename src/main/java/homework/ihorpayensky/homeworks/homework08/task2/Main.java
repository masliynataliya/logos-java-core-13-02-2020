package homework.ihorpayensky.homeworks.homework08.task2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try {
            System.out.print("Введіть число: ");
            Scanner s = new Scanner(System.in);

            if (s.hasNextBigInteger() && s.nextInt()%2 == 0)
                System.out.println("Це число ціле і парне");
            else System.out.println("EXCEPTION)");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
