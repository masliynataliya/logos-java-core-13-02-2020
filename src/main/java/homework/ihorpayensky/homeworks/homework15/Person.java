package homework.ihorpayensky.homeworks.homework15;

import java.util.Objects;

class Person {
    private int id;
    private static int maxId = 0;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public Person(String name, int age) {
        this.id = maxId;
        maxId++;
        this.name = name;
        this.age = age;
    }

    public Person() { }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
