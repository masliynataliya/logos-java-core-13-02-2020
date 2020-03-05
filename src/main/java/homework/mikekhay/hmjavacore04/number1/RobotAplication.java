package homework.mikekhay.hmjavacore04.number1;

public class RobotAplication {
    public static void main(String[] args) {

        Robot robot = new Robot();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCoocker robotCoocker = new RobotCoocker();

        robot.work();
        coffeRobot.work();
        robotDancer.work();
        robotCoocker.work();

        Robot[] robots = new Robot[4];
        robots[0] = new Robot();
        robots[1] = new CoffeRobot();
        robots[2] = new RobotDancer();
        robots[3] = new RobotCoocker();

        for (int a = 0; a < robots.length; a++){
        robots[a].work();}

    }
}
