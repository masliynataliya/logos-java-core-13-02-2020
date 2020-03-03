package homework.pavliuk.HW.JC4.Robot;

public class RobotAplication {
    public static void main(String[] args){

        Robot robot1=new Robot();
        RobotCoffe robot2=new RobotCoffe();
        RobotDancer robot3=new RobotDancer();
        RobotCooker robot4=new RobotCooker();

        robot1.work();
        robot2.work();
        robot3.work();
        robot4.work();

        System.out.println();

        Robot[] robot=new Robot[4];
        robot[0]=new Robot();
        robot[1]=new RobotCoffe();
        robot[2]=new RobotDancer();
        robot[3]=new RobotCooker();

        for (int i=0;i<robot.length;i++){
            robot[i].work();
        }
    }

}
