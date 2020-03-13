package homework.didukhigor.homework.javacore4.animal;

public class Animal {

    private String name;
    private int age;
    private double speed;

      Animal(String name, int age, double speed) {
        this.name = name;
        this.age = age;
        this.speed = speed;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public double getSpeed() { return speed; }

    public void setSpeed(double speed) { this.speed = speed; }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", speed=" + speed +
                '}';
    }



}
