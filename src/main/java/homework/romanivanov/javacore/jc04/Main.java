package homework.romanivanov.javacore.jc04;

public class Main {
    public static void main(String[] args) {


        Robot rb1 = new Robot();
        RobotCoffe rb2 = new RobotCoffe();
        RobotCoocker rb3 = new RobotCoocker();
        DancerRobot rb4 = new DancerRobot();

        rb1.work();
        rb2.work();
        rb3.work();
        rb4.work();

        Robot[] rbs = new Robot[4];
        rbs [0] = new Robot();
        rbs [1] = new RobotCoffe();
        rbs [2] = new DancerRobot();
        rbs [3] = new RobotCoocker();

        for (int b = 0;b< rbs.length; b++){
            rbs[b].work();
        }


    }


}
