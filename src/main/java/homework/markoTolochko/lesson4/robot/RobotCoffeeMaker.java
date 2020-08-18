package homework.markoTolochko.lesson4.robot;

public class RobotCoffeeMaker extends Robot {
    public RobotCoffeeMaker() {
      this.name = "robotCoffeeMaker";
    }
    @Override
    public void work() {
        System.out.println("i am " + name + " and i makingCoffe");
    }
    @Override
    public String toString() {
        return "RobotCoffeeMaker{" +
                "name='" + name + '\'' +
                '}';
    }
}
