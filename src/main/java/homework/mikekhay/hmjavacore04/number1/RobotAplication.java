package homework.mikekhay.hmjavacore04.number1;

public class RobotAplication {
    public static void main(String[] args) {


        Robot[] robots = new Robot[4];
        robots[0] = new Robot();
        robots[1] = new CoffeRobot();
        robots[2] = new RobotDancer();
        robots[3] = new RobotCoocker();

        for (Robot robot : robots) robot.work();


    }
}
