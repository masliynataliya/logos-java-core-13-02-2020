package homework.mikekhay.hwjavacore04.number3;

public class Animal {
    private String name;
    private double age;
    private double speed;

    public Animal() {}
    public Animal(String name, double age, double speed){
        this.name = name;
        this.age = age;
        this.speed = speed;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getAge(){
        return age;
    }
    public void setAge(double age){
        this.age = age;
    }
    public double getSpeed(){
        return speed;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
}