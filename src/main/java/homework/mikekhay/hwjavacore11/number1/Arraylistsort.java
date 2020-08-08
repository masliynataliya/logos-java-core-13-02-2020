package homework.mikekhay.hwjavacore11.number1;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.*;

public class Arraylistsort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(55);
        list.add(37);
        list.add(3);
        list.add(17);
        list.add(1);
        list.add(100);
        list.add(85);

        System.out.println("Не сортований масив            = " + list);
        list.sort(Collections.reverseOrder());
        System.out.println("Сортування в порядку спадання  = " + list);
        Collections.sort(list);
        System.out.println("Сортування в порядку зростання = " + list);

    }
}
