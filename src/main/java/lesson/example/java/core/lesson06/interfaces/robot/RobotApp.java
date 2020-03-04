package lesson.example.java.core.lesson06.interfaces.robot;

public class RobotApp {

    public static void main(String[] args) {
        Robot robot = new CoffeeRobotImpl();
        robot.work();
        robot.dance();
        robot.sing();
    }
}

