package homework.markoTolochko.lesson4.robot;

public class RobotCoocker extends Robot {
    public RobotCoocker() {
        this.name = "robotCoocker";
    }
    @Override
    public void work() {
        System.out.println("i am " + name + " and i coocking");
    }
    @Override
    public String toString() {
        return "RobotCoocker{" +
                "name='" + name + '\'' +
                '}';
    }
}
