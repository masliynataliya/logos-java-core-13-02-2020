package homework.ihorpayensky.homeworks.homework14.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Cat> cats = new HashSet<>();
        for (int i = 0; i < 15; i++) {
            cats.add(new Cat());
        }

        int i = 0;
        for (Cat c: cats) {
            System.out.println((i+1) + " " + c.toString());
            i++;
        }

        System.out.println();

        // елементів буде менше тому що воно містить тільки унікальні унікальні значення
        TreeSet<Cat> sortedCats = new TreeSet<>();
        sortedCats.addAll(cats);

        int j = 0;
        for (Cat c: sortedCats) {
            System.out.println((j+1) + " " + c.toString());
            j++;
        }


    }
}