package lesson.example.java.core.lesson06.interfaces.robot;

public class CoffeeRobotImpl implements Robot {
    @Override
    public void work() {
        System.out.println("Do you want coffee?");
    }

    @Override
    public void sing() {
        System.out.println("Lallalal");
    }

    @Override
    public void dance() {
        System.out.println("Disco dance");
    }
}
