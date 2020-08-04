package lesson.example.java.core.lesson11;

import java.util.Random;

public class Person {

    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;

        Random random = new Random();
        int min = 18;
        int max = 45;
        age = random.nextInt(max - min + 1) + min;

        String[] genders = {"F", "M"};
        int randomNum = random.nextInt(genders.length);
        gender = genders[randomNum];

    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", gender='" + gender + '\'' +
            '}';
    }
}
