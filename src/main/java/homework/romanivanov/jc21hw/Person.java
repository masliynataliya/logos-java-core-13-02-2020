package homework.romanivanov.jc21hw;

public class Person {
    @AnnotationExample("Lol")
    String name;
    String lastName;
    @AnnotationExample("Kek")
    String surName;

    public Person(String name, String lastName, String surName) {
        this.name = name;
        this.lastName = lastName;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }


}
