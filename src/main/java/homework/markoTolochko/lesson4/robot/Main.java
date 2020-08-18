package homework.markoTolochko.lesson4.robot;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.work();
        RobotCoocker robotCoocker = new RobotCoocker();
        robotCoocker.work();
        RobotDancer robotDancer = new RobotDancer();
        robotDancer.work();
        RobotCoffeeMaker robotCoffeeMaker = new RobotCoffeeMaker();
        robotCoffeeMaker.work();

        System.out.println();
        System.out.println();

        Robot[] robotArray = {robot, robotCoocker, robotDancer, robotCoffeeMaker};
        for (Robot robArr: robotArray){
            System.out.println(robArr);
            robArr.work();
        }
    }
}
