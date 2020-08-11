package homework.romanivanov.javacore.jc14hw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CommodityFunction {
    Scanner sc = new Scanner(System.in);

    public void addCommodity(ArrayList<Commodity> commodities) {
        Commodity commodity = new Commodity();
        System.out.println("Введіть назву товара");
        commodity.setName(sc.next());
        System.out.println("Введіть довжину товара");
        commodity.setLength(sc.nextInt());
        System.out.println("Введіть ширину товара");
        commodity.setWidth(sc.nextInt());
        System.out.println("Введіть вагу товара");
        commodity.setWeight(sc.nextInt());
        commodities.add(commodity);
    }

    public void removeByName(ArrayList<Commodity> commodities) {
        Iterator<Commodity> iterator = commodities.iterator();
        System.out.println("Введіть ім'я товара яке хочете видалити");
        String name = sc.next();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equalsIgnoreCase(name)) {
                iterator.remove();
            }
        }
    }

    public void sortByLength(ArrayList<Commodity> commodities) {
        commodities.sort(new CommodityLengthComparator());
        for (Commodity c : commodities) {
            System.out.println(c);
        }

    }
//        commodities.stream().sorted((com1, com2) -> {
//            int length1 = com1.getLength();
//            int length2 =  com2.getLength();
//            if (length1 > length2){
//                return 1;
//            }
//            if (length1 < length2){
//                return -1;
//            }else return 0;
//
//        }); якщо не робити окремі класи компараторів щоб не нагромаджувати їх, можна зробити анонімні класиі прописати
//        вже в них логіку


    public void sortByWidth(ArrayList<Commodity> commodities) {
        commodities.sort(new CommodityWidthComparator());
        for (Commodity c : commodities) {
            System.out.println(c);
        }
    }

    public void sortByName(ArrayList<Commodity> commodities) {
        commodities.sort(new CommodityNameComparator());
        for (Commodity c : commodities) {
            System.out.println(c);
        }
    }

    public void sortByLWeight(ArrayList<Commodity> commodities) {
        commodities.sort(new CommodityWeightComparator());
        for (Commodity c : commodities) {
            System.out.println(c);
        }
    }

    public void deleteByIndex(ArrayList<Commodity> commodities) {
        System.out.println("Введіть індекс колеції");
        int index = sc.nextInt();
        for (int i = 0; i < commodities.size(); i++) {
            if (commodities.get(i) == commodities.get(index)) {
                commodities.remove(i);
            }
        }
    }


    public void changeCommodity(ArrayList<Commodity> commodities) {
        System.out.println("Введіть ім'я товара яке хочете замінити");
        String name = sc.next();
        for (Commodity c : commodities) {
            if (c.getName().equalsIgnoreCase(name)) {
                commodities.set(commodities.indexOf(c), getCommodity());
            }
        }
    }

    public Commodity getCommodity() {
        Commodity commodity = new Commodity();
        System.out.println("Введіть назву товара");
        commodity.setName(sc.next());
        System.out.println("Введіть довжину товара");
        commodity.setLength(sc.nextInt());
        System.out.println("Введіть ширину товара");
        commodity.setWidth(sc.nextInt());
        System.out.println("Введіть вагу товара");
        commodity.setWeight(sc.nextInt());
        return commodity;
    }

}
