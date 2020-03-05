package lesson.example.java.core.lesson07.isp.good;

import lesson.example.java.core.lesson07.isp.bad.Bird;

public class Duck  implements Swimable, Flyable{

    @Override
    public void fly() {
        System.out.println("Duck flies");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims");
    }
}
