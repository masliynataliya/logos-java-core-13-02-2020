package homework.romanivanov.javacore.jc14hw;

import java.util.ArrayList;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        CommodityFunction commodity = new CommodityFunction();
        ArrayList<Commodity> commodities = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        info();
        while (b) {
            System.out.println("Виберіть опцію");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    commodity.addCommodity(commodities);
                    System.out.println(commodities);
                    break;
                case 2:
                    commodity.removeByName(commodities);
                    System.out.println(commodities);
                    break;
                case 3:
                    commodity.changeCommodity(commodities);
                    System.out.println(commodities);
                    break;
                case 4:
                    commodity.sortByName(commodities);
                    break;
                case 5:
                    commodity.sortByLength(commodities);
                    break;
                case 6:
                    commodity.sortByLWeight(commodities);
                    break;
                case 7:
                    commodity.sortByWidth(commodities);
                    break;
                case 8:
                    System.out.println(commodities);
                    commodity.deleteByIndex(commodities);
                    System.out.println(commodities);
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
