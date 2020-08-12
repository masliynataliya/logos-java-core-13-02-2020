package lesson.example.java.core.lesson15;

import java.util.Objects;

public class StudentUKU {

    public String lastName;

    private String name;
    private int level;
    private int age;

    public StudentUKU() {

    }

    public StudentUKU(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public StudentUKU(int level) {
        this.level = level;
    }

    public StudentUKU(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentUKU{" +
            "name='" + name + '\'' +
            ", level=" + level +
            ", age=" + age +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StudentUKU that = (StudentUKU) o;
        return level == that.level &&
            age == that.age &&
            Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level, age);
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getAge() {
        return age;
    }

    public StudentUKU(String name, int level, int age) {
        this.name = name;
        this.level = level;
        this.age = age;
    }

    public void printHello() {
        System.out.println("Hello, my name is " + this.getName());
    }
}
