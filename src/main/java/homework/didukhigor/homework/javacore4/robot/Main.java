package homework.didukhigor.homework.javacore4.robot;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();
        CoffeeRobot coffeeRobot = new CoffeeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCoocker robotCoocker = new RobotCoocker();

        robot.work();
        coffeeRobot.work();
        robotDancer.work();
        robotCoocker.work();

        System.out.println();

        Robot[] robots = {robot, coffeeRobot, robotDancer, robotCoocker};

        for (int i = 0; i < robots.length; i++) {
            robots[i].work();
        }
    }
}
