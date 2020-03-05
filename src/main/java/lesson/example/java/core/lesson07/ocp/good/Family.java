package lesson.example.java.core.lesson07.ocp.good;

public class Family implements Personality{
    @Override
    public void greet() {
        System.out.println("How are you, darling");
    }
}