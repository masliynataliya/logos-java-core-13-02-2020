package homework.ihorpayensky.homeworks.homework11.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Random r = new Random();

        Car[][] mas = new Car[r.nextInt(6-2+1)+2][r.nextInt(6-2+1)+2];

        System.out.println("Random array : [" + mas.length + "] [" + mas[0].length + "]");
        System.out.println("Empty array  : " + Arrays.deepToString(mas));

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                mas[i][j] = new Car();
            }
        }
        System.out.println("Array cars: " + Arrays.deepToString(mas));

        System.out.println(" === Консольна програма ===");

        while (true) {
            System.out.println("Виберіть опцію: ");
            System.out.println("1 - вивести елементи з списку");
            System.out.println("2 - заповнити всі комірки масиву одним елементом");
            System.out.print(" >> ");
            String scaner = new Scanner(System.in).nextLine();
            System.out.println();

            if (scaner.equalsIgnoreCase("1")) {
                System.out.println("Масив автомоб: \n" + Arrays.deepToString(mas));
            } else if (scaner.equalsIgnoreCase("2")) {
                Car car = new Car();
                System.out.println("Згенеровано автомобіль + " + car.toString());
                for (Car[] ma : mas) {
                    Arrays.fill(ma, car);
                }
                System.out.println("Масив автомобілей переписано!");
            } else {
                System.out.println("Вихід з програми");
                System.exit(0);
            }
        }
    }
}
