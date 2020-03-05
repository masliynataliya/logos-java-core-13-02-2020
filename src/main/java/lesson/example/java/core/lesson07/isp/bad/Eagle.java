package lesson.example.java.core.lesson07.isp.bad;

public class Eagle implements Bird {
    @Override
    public void fly() {
        System.out.println("Eagle flies");
    }

    @Override
    public void swim() {
        // do not implement
        System.out.println("oops");
    }
}
