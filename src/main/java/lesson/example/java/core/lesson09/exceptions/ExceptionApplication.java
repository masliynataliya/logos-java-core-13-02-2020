package lesson.example.java.core.lesson09.exceptions;

import java.util.Scanner;

public class ExceptionApplication {

    public static void main(String[] args) {
        doSomething();
    }

    public static void doSomething() {
        Scanner sc = new Scanner(System.in);
        try {
            double i = sc.nextDouble();
            if (i % 1 != 0.0) {
                throw new LogosNotFoundException("Is not integer");
            } else {
                System.out.println("Good");

                int v = (int) i / 0;
            }
        } catch (LogosNotFoundException e) {
            System.out.println("something went wrong");
        } catch (Exception e) {
            System.out.println("oops");
        } finally {
            System.out.println("qwerty");
        }


        System.out.println("but still goes...");
    }
}
