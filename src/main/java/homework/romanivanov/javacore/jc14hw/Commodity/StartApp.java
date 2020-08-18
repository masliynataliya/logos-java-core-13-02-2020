package homework.romanivanov.javacore.jc14hw.Commodity;

import java.util.ArrayList;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Commodity commodity = new Commodity();
        ArrayList<Commodity> commodities = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        info();
        while (true) {
            System.out.println("Виберіть опцію");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    commodity.addCommodity();

                    break;
                case 2:
                    commodity.removeByName();

                    break;
                case 3:
                    commodity.changeCommodity();
                    break;
                case 4:
                    commodity.sortByName();
                    break;
                case 5:
                    commodity.sortByLength();
                    break;
                case 6:
                    commodity.sortByLWeight();
                    break;
                case 7:
                    commodity.sortByWidth();
                    break;
                case 8:
                    commodity.findByIndex();
                    break;
                case 9:
                    info();
                    break;
                case 10:
                    System.exit(0);
            }

        }

    }

    public static void info() {
        System.out.println("Введіть 1 для того щоб додати товар ");
        System.out.println("Введіть 2 для того щоб видалити товар");
        System.out.println("Введіть 3 для того щоб замінити товар ");
        System.out.println("Введіть 4 для того щоб сортувати за назвою ");
        System.out.println("Введіть 5 для того щоб сортувати за довжиною ");
        System.out.println("Введіть 6 для того щоб сортувати за вагою ");
        System.out.println("Введіть 7 для того щоб сортувати за шириною ");
        System.out.println("Введіть 8 для того щоб видалити товар за індексом ");
        System.out.println("Введіть 9 для того щоб щоб побачити інфо");
        System.out.println("Введіть 10 для того щоб завершити роботу ");
    }


}
