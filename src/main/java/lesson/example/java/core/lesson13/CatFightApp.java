package lesson.example.java.core.lesson13;

import java.util.ArrayList;

public class CatFightApp {

    public static void main(String[] args) {
        Cat murko = new Cat("Murko", 10, 20);
        Cat barsik = new Cat("Barsik", 3, 15);

        System.out.println(murko.compareTo(barsik));

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(barsik);
        cats.add(murko);

        System.out.println(cats);

        cats.sort(new CatStrengthAgeComparator());

        System.out.println(cats);

    }
}
