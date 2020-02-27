package lesson.example.java.core.lesson04;

import lesson.example.java.core.lesson03.Person;

public class Application {
    public static void main(String[] args) {
        Horse h1 = new Horse(1.5);
        System.out.println(h1);
        h1.run();
        h1.speak();

        Pegasus p = new Pegasus(2.5, 3.4);
        System.out.println(p);
        p.fly();
        p.run();
        p.speak();
        System.out.println(p.getColor());
    }
}
