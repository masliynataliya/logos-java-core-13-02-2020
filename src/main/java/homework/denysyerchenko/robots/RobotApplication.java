package homework.denysyerchenko.robots;

public class RobotApplication {
    public static void main(String[] args) {
        Robot robot = new Robot();
        CoffeeRobot coffeeRobot = new CoffeeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCooker robotCooker = new RobotCooker();

        Robot robots[] = {robot, coffeeRobot, robotDancer, robotCooker};

        for (int c = 0; c < robots.length; c++) {
            robots[c].work();
        }
    }
}