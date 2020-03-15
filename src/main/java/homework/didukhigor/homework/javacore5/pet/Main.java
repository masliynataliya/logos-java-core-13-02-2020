package homework.didukhigor.homework.javacore5.pet;

import homework.didukhigor.homework.javacore5.Cat;
import homework.didukhigor.homework.javacore5.Cow;
import homework.didukhigor.homework.javacore5.Dog;

public class Main {

    public static void main(String[] args) {
         Cow cow = new Cow();
         Cat cat = new Cat();
         Dog dog = new Dog();

         cow.voice();
         cat.voice();
         dog.voice();

    }
}
