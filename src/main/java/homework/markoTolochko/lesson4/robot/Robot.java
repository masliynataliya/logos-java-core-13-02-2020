package homework.markoTolochko.lesson4.robot;

public class Robot {
    protected String name;

    public Robot() {
        this.name = "robot";
    }
    public void work(){
        System.out.println( "i am " + name + " and i working");
    }
    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                '}';
    }
}
