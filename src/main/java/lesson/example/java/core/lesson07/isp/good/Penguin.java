package lesson.example.java.core.lesson07.isp.good;

import lesson.example.java.core.lesson07.isp.bad.Bird;

public class Penguin implements Swimable {

    @Override
    public void swim() {
        System.out.println("Uiiiii");
    }
}
