package homework.markoTolochko.lesson4Animal;

public class Animal {
    private String name;
    private int speed;
    private int age;

    public void getAnimalInfo(){
        System.out.println(" name: " + name + ", speed: " + speed + ", age: " + age);
    }

    public Animal() {
        this.name = "koza";
        this.speed = 240;
        this.age = 99;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
