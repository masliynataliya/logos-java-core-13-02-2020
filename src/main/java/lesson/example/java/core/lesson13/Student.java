package lesson.example.java.core.lesson13;

public class Student {

    private int level;
    private String name;
    private int age;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public Student(int level, String name, int age) {
        this.level = level;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
            "level=" + level +
            ", name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
