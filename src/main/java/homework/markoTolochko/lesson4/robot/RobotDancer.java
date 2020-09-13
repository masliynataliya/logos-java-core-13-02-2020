package homework.markoTolochko.lesson4.robot;

public class RobotDancer extends Robot {

    public RobotDancer() {
        this.name = "robotDancer";
    }
    @Override
    public void work() {
        System.out.println("i am " + name + " and i dancing");
    }
    @Override
    public String toString() {
        return "RobotDancer{" +
                "name='" + name + '\'' +
                '}';
    }
}
