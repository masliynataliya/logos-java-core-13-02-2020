package homework.romanivanov.javacore.jc08hw;

import java.util.Scanner;

public class PairNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number % 2 == 0) {
            System.out.println("Є парне");
        } else {
            System.out.println("Не є парне");
        }

    }








}
