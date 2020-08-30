package lesson.example.java.core.lesson13;

import java.util.Objects;

public class Student implements Comparable<Student>{

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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return level == student.level &&
            age == student.age &&
            Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, name, age);
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

    @Override
    public int compareTo(Student otherStudent) {
        int student1level = this.getLevel();
        int student2level = otherStudent.getLevel();

        String student1Name = this.getName();
        String student2Name = otherStudent.getName();

        int student1age = this.getAge();
        int student2age = otherStudent.getAge();

        if (student1level > student2level) {
            return 1;
        } else if (student1level < student2level) {
            return -1;
        } else {
            if (student1Name.compareTo(student2Name) != 0) {
                return student1Name.compareTo(student2Name);
            } else {
                if (student1age > student2age) {
                    return 1;
                } else if (student1age < student2age) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}
