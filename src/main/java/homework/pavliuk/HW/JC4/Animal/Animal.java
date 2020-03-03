package homework.pavliuk.HW.JC4.Animal;

public class Animal {
    private int speed=100;
    private int age=20;
    private String name="cat";

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Animal name is " + name + ". Animal speed is "+ speed + " km/hour. Animal age is "+ age+" years.";
}}
