package lesson.example.java.core.lesson21.student;

public class Student {

    @Social("Hello! I'm ")
    private String name;

    @Social("My age is ")
    private int age;

    private int weight;

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", weight=" + weight +
            '}';
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Student(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
