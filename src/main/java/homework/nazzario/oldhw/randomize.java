package homework.nazzario.oldhw;

import java.util.Random;
import java.util.Scanner;

public class randomize {

    public static class Main {
        //    5. Створіть масив, наповніть його даниими в хаотичному порядку, знайдіть найбільше та найменше значення масиву.
        public static void main(String[] args) {
            System.out.print("Введіть величину масиву ");
            Scanner scan = new Scanner(System.in);
            int[] numbers = new int[scan.nextInt()];
            Random rand = new Random();
            int upperbound = 100;

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = rand.nextInt(upperbound);
                System.out.print(numbers[i]+" ");
            }

            int max = numbers[0];
            int min = numbers[0];

            for (int i = 0; i < numbers.length; i++) {
                if (max < numbers[i]) {
                    max = numbers[i];
                }
                if (min > numbers[i]) {
                    min = numbers[i];
                }
            }

            System.out.println("The largest number in this array is " + max + ".");
            System.out.println("The smallest number in this array is " + min + ".");
        }
    }
}
