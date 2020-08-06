package lesson.example.java.core.lesson13;

import java.util.ArrayList;

public class StudentApp {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(3, "Anna", 23));
        students.add(new Student(3, "Anna", 88));
        students.add(new Student(2, "Maria", 21));
        students.add(new Student(1, "Robert", 19));
        students.add(new Student(4, "Gregg", 17));
        students.add(new Student(3, "Bob", 18));
        students.add(new Student(2, "Yulia", 23));
        students.add(new Student(3, "Anna", 88));
        students.add(new Student(5, "Nata", 25));
        students.add(new Student(3, "Anna", 24));

        System.out.println("Before name sorting");
        for (Student s : students) {
            System.out.println(s);
        }

        students.sort(new StudentLevelNameAgeComparator());

        System.out.println();
        System.out.println("After level sorting");
        for (Student s : students) {
            System.out.println(s);
        }

    }
}
