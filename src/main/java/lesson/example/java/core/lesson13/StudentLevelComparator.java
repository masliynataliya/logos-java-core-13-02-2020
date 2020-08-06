package lesson.example.java.core.lesson13;

import java.util.Comparator;

public class StudentLevelComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        int student1level = student1.getLevel();
        int student2level = student2.getLevel();

        if (student1level > student2level) {
            return 1;
        }
        if (student1level < student2level) {
            return -1;
        }
        return 0;
    }
}
