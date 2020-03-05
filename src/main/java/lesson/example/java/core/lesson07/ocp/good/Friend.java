package lesson.example.java.core.lesson07.ocp.good;

public class Friend implements Personality{
    @Override
    public void greet() {
        System.out.println("Hi, bro!");
    }
}
