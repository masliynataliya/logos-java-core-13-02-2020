package homework.denysyerchenko.lesson08.numbers;

import java.util.Scanner;

public class Numbers2 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        while (number % 1 != 0.0) {
            System.out.println("Entered number is incorrect");
            System.out.println("Enter the number again: ");
            number = scanner.nextDouble();
        }
        if (number % 2 == 0.0) {
            System.out.println("Entered number is even");
        }
        if (number % 2 != 0.0) {
            System.out.println("Entered number is odd");
        }
    }
}
