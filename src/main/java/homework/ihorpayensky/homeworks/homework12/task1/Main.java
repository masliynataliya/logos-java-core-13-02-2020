package homework.ihorpayensky.homeworks.homework12.task1;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

class Main {
    public static void main(String[] args) {

        Random r = new Random();
        List<Car> cars = new ArrayList<Car>();

        System.out.println("Empty array: " + cars.toString());

        for (int i = 0; i < r.nextInt(5)+2; i++) {
            cars.add(new Car());
        }
        System.out.println("Random array length: [" + cars.size() + "]");
        System.out.println("Array field: " + cars.toString());

        System.out.println(" === Консольна програма === ");
        System.out.println();

        while (true) {
            System.out.println("Виберіть опцію: ");
            System.out.println("1 - вивести елементи з списку");
            System.out.println("2 - замінити всі обєкти класу Car на один згенерований");
            System.out.print(" >> ");
            String scaner = new Scanner(System.in).nextLine();
            System.out.println();

            if (scaner.equalsIgnoreCase("1")) {
                System.out.println("Array field:\n" + cars.toString());
                System.out.println();
            } else if (scaner.equalsIgnoreCase("2")) {
                Car car = new Car();
                System.out.println("Згенеровано автомобіль: " + car.toString());
                cars.replaceAll(c -> car);
                System.out.println("Список автомобілей переписано!");
            } else {
                System.out.println("Вихід з програми");
                System.exit(0);
            }
        }

    }
}
