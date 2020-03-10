package homework.ihorpayensky.homeworks.homework08.task3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try {
            System.out.print("Enter the first number:  ");
            Scanner s1 = new Scanner(System.in);
            checkInt(s1);

            System.out.print("Enter the second number: ");
            Scanner s2 = new Scanner(System.in);
            checkInt(s2);

            System.out.println("Result of adding : " + (s1.nextInt()+s2.nextInt()));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkInt(Scanner s) {
        if (!s.hasNextBigInteger()) {
            System.out.println("Error! число не є цілим!");
            System.exit(0);
        }
    }
}
