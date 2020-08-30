package lesson.example.java.core.lesson19.serialization;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private String lastName;
    private int age;
    private Dog dog;

    public Person(String name, String lastName, int age, Dog dog) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.dog = dog;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", lastName='" + lastName + '\'' +
            ", age=" + age +
            ", dog=" + dog +
            '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
