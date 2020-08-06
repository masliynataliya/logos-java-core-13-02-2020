package lesson.example.java.core.lesson13;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        String student1Name = student1.getName();
        String student2Name = student2.getName();

//        if (student1Name.compareTo(student2Name) == 1) {
//            return 1;
//        } else if (student1Name.compareTo(student2Name) == -1 ) {
//            return  -1;
//        } else {
//            return 0;
//        }

        return student1Name.compareTo(student2Name);
    }
}
