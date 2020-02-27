package homework.pavliuk;

import javax.naming.Name;
import java.sql.SQLOutput;

public class Person {

    private String name = "iDontKnow";
    private int age = 18;
    private String male = "man";
    private int number = 32394;

    @Override
    public String toString() {
        return "Person[Name= " + name + "; Age= " + age + "; Male= " + male + " ; Nubmer= " + number;
    }

    public Person() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My male is " + male);
        System.out.println("My number is " + number);
    }

    public Person(String name) {
        this.name = name;
        this.age = age;
        System.out.println("Person " + name + " age " + age);
    }

    public void say() {
        System.out.println("Hi, my name is " + name);
    }

    public Person(String name, int age) {
        System.out.println("Person name is " + name + " and my age is " + age);
    }

    public void sayNameAge(String name, int age) {
        System.out.println("Hi, my name is " + name + " and age is " + age);

    }
}




