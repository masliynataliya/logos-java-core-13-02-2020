package lesson.example.java.core.lesson07.isp.bad;

public class Duck  implements Bird{
    @Override
    public void fly() {
        System.out.println("Duck flies");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims");
    }
}
