package homework.romanivanov.javacore.jc04;

public class Animal {

   private String name;
    private int age;
    private int speed;


    public Animal(String name, int age, int speed) {
        this.name = name;
        this.age = age;
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public int getAge() {
        return age;

    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public String toString() {
        return "Назва тварини = " + name +"," + "Швидкість тварини = " + speed + "км/год," + "Вік Тварини = "
                + age +" років.";

    }

}
