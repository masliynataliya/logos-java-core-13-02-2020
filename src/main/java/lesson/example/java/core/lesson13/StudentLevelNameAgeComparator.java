package lesson.example.java.core.lesson13;

import java.util.Comparator;
import java.util.stream.Collector;

public class StudentLevelNameAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        int student1level = student1.getLevel();
        int student2level = student2.getLevel();

        String student1Name = student1.getName();
        String student2Name = student2.getName();

        int student1age = student1.getAge();
        int student2age = student2.getAge();

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
