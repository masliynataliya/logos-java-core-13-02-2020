package homework.katerynakikidzhan.JC04.first;

public class RobotApplication {
    public static void main(String[] args) {
        Robot robot =  new Robot();
        Robot coffeeRobot = new CoffeeRobot();
        Robot robotDancer = new RobotDancer();
        Robot robotCooker = new RobotCooker();

        robot.work();
        coffeeRobot.work();
        robotDancer.work();
        robotCooker.work();

        System.out.println();

        Robot[] robots = {robot, coffeeRobot, robotDancer, robotCooker};

        for (int i = 0; i < robots.length; i++) {
            robots[i].work();
        }

    }
}
