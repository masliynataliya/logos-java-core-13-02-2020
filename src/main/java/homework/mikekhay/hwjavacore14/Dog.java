package homework.mikekhay.hwjavacore14;

import java.util.Comparator;
import java.util.Objects;

public class Dog implements Comparable<Dog> {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Dog dog) {

        int age1 = this.getAge();
        int age2 = dog.getAge();

        String name1=this.getName();
        String name2=dog.getName();

        if (age1 < age2){
            return 1;
        }
        if (age1 > age2){
            return -1;
        }
        else {
            return name1.compareTo(name2);
        }
    }


    }