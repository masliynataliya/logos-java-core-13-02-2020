package homework.romanivanov.javacore.jc14hw.Commodity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Commodity {
    private String name;
    private int length;
    private int width;
    private int weight;
    Scanner sc = new Scanner(System.in);
    ArrayList<Commodity> commodities;

    public Commodity() {
        commodities = new ArrayList<>();
    }



    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public Commodity setName(String name) {
        this.name = name;
        return this;
    }

    public int getLength() {
        return length;
    }

    public Commodity setLength(int length) {
        this.length = length;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public Commodity setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Commodity setWeight(int weight) {
        this.weight = weight;
        return this;
    }
    public void addCommodity(){
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
        System.out.println("Товар додано");
        }
    public void removeByName() {
        Iterator<Commodity> iterator = commodities.iterator();
        System.out.println("Введіть ім'я товара яке хочете видалити");
        String name = sc.next();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Товар видалено");
            }
        }
    }
    public void sortByLength() {
        commodities.sort(new CommodityLengthComparator());
        for (Commodity c : commodities) {
            System.out.println(c);
        }

    }

    public void sortByWidth() {
        commodities.sort(new CommodityWidthComparator());
        for (Commodity c : commodities) {
            System.out.println(c);
        }
    }

    public void sortByName() {
        commodities.sort(new CommodityNameComparator());
        for (Commodity c : commodities) {
            System.out.println(c);
        }
    }

    public void sortByLWeight() {
        commodities.sort(new CommodityWeightComparator());
        for (Commodity c : commodities) {
            System.out.println(c);
        }
    }

    public void findByIndex() {
        boolean b = true;
        System.out.println("Введіть i-тий елемент колекції колеції");
        int index = sc.nextInt();
        for (int i = 0; i < commodities.size(); i++) {
            if (commodities.get(i) == commodities.get(index)) {
                System.out.println(commodities.get(i));
                b = false;

            }
        }
        if(b){
            System.out.println("Такого елемента не існує");
        }
    }


    public void changeCommodity() {
        boolean b = true;
        System.out.println("Введіть ім'я товара яке хочете замінити");
        String name = sc.next();
        for (Commodity c : commodities) {
            if (c.getName().equalsIgnoreCase(name)) {
                commodities.set(commodities.indexOf(c), getCommodity());
                System.out.println("Товар змінено");
                b = false;
            }
        }
        if (b){
            System.out.println("Такого тавара не знайдено");
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
