package lesson.example.java.core.lesson05.static0;

import lesson.example.java.core.lesson05.static0.Cat;

public class StaticExampleApplication {

    public static void main(String[] args) {

        System.out.println(Cat.getCatCount());

        Cat mattew = new Cat("Mattew", "gray");
        Cat anna = new Cat("Anna", "white");

        System.out.println(anna);
        System.out.println(Cat.getDESCRIPTION());
    }
}
