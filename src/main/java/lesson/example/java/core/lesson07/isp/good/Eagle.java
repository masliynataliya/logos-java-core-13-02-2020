package lesson.example.java.core.lesson07.isp.good;

import lesson.example.java.core.lesson07.isp.bad.Bird;

public class Eagle implements Flyable {

    @Override
    public void fly() {
        System.out.println("Eagle flies");
    }

}
