package homework.ihorpayensky.homeworks.homework16;

import java.util.Arrays;

class Pet {
    private String name;
    private String type;
    private int age;
    private double weight;

    public Pet() { }
    public Pet(String name, String type, int age, double weight) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public void myMethod(String name, int t) {
        for (int i = 0; i < (t < 0 ? t*(-1) : t); i++) {
            System.out.println("Hello, " + name);
        }
    }
    public void myMethod(String[] args) {
        System.out.println(Arrays.toString(args));
    }


}
