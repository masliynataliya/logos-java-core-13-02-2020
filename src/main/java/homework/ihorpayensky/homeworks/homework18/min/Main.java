package homework.ihorpayensky.homeworks.homework18.min;

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void addToList(List list) { // тут список виступає як List<Object>
        list.add("0067");
        list.add("bb");
        list.add("add");
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        addToList(list);

        System.out.println(list.get(0));    // витягуємо по одному елементу і виводим
        System.out.println(list.get(1));
        System.out.println("This is magic");

        for (var e: list) {                 // Exception
            System.out.println(e);
        }
    }
}
