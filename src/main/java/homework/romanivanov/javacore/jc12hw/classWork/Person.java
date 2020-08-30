package homework.romanivanov.javacore.jc12hw.classWork;

public class Person {
    private String name;
    private int number;

    public Person() {
    }

    public Person(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public Person setNumber(int number) {
        this.number = number;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }


}



