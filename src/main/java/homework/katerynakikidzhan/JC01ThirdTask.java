package homework.katerynakikidzhan;

import java.util.Random;

public class JC01ThirdTask {
//    3. Створити масив, наповнити його 10 значеннями типу int
//    знайти  максимальне та  мінімальне значення в масиві та вивести їх на консоль.
    public static void main(String[] args) {
        int[] numbers = new int [10];

        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
            System.out.println(numbers[i]);
        }

        int Max = numbers[0];
        int Min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (Max < numbers[i]) {
                Max = numbers[i];
            }
            if (Min > numbers[i]) {
                Min = numbers[i];
            }
        }

        System.out.println("The largest value in this array is " + Max + ".");
        System.out.println("The smallest value in this array is " + Min + ".");
    }
}
