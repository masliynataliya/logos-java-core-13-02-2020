package homework.denysyerchenko.lesson08.numbers;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("Enter number a: ");
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        while (firstNumber % 1 != 0.0) {
            System.out.println("Number a is incorrect");
            System.out.println("Enter a again: ");
            firstNumber = scanner.nextDouble();
        }
        if (firstNumber % 1 == 0.0) {
            System.out.println("Enter b: ");
            double secondNumber = scanner.nextDouble();
            while (secondNumber % 1 != 0.0) {
                System.out.println("Number b is incorrect");
                System.out.println("Enter b again: ");
                secondNumber = scanner.nextDouble();
            }
            if (secondNumber % 1 == 0.0) {
                System.out.println("The sum = " + (firstNumber + secondNumber));
                    }
                }
            }
        }
