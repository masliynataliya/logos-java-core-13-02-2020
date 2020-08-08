package lesson.example.java.core.lesson14;

import java.util.*;
import lesson.example.java.core.lesson13.Student;
import lesson.example.java.core.lesson13.StudentNameComparator;

public class SetApp {

    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Monday");
        stringArrayList.add("Monday");
        stringArrayList.add("Monday");
        stringArrayList.add("Tuesday");
        stringArrayList.add("Wednesday");
        stringArrayList.add("Thursday");
        stringArrayList.add("Friday");
        stringArrayList.add("Saturday");
        stringArrayList.add("Sunday");

        ListIterator<String> listIterator = stringArrayList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println();

        HashSet<String> set = new HashSet<>(stringArrayList);
        Iterator<String> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }

        System.out.println();
        HashSet<String> set2 = new HashSet();
        System.out.println(set2.isEmpty());
        set2.add("New string");
        System.out.println(set2.isEmpty());

        System.out.println();
        System.out.println(set2.contains("string"));
        System.out.println(set2.contains("New string"));

        System.out.println();
        set2.addAll(stringArrayList);
        Iterator<String> setIterator2 = set2.iterator();
        while (setIterator2.hasNext()) {
            System.out.println(setIterator2.next());
        }

        System.out.println();
        HashSet<Student> studentsSet = new HashSet<>();
        studentsSet.add(new Student(3, "Anna", 23));
        studentsSet.add(new Student(3, "Anna", 88));
        studentsSet.add(new Student(3, "Anna", 88));
        studentsSet.add(new Student(5, "Nata", 25));
        studentsSet.add(new Student(4, "Anna", 24));
        Iterator<Student> setIterator3 = studentsSet.iterator();
        while (setIterator3.hasNext()) {
            System.out.println(setIterator3.next());
        }

        LinkedHashSet<Student> studentsLinkedSet = new LinkedHashSet<>();
        studentsLinkedSet.add(new Student(3, "Anna", 23));
        studentsLinkedSet.add(new Student(3, "Anna", 88));
        studentsLinkedSet.add(new Student(3, "Anna", 88));
        studentsLinkedSet.add(new Student(5, "Nata", 25));
        studentsLinkedSet.add(new Student(4, "Anna", 24));
        Iterator<Student> setIterator4 = studentsLinkedSet.iterator();
        while (setIterator4.hasNext()) {
            System.out.println(setIterator4.next());
        }

        System.out.println();
        TreeSet<Student> studentTreeSet = new TreeSet<>();
        studentTreeSet.add(new Student(3, "Anna", 23));
        studentTreeSet.add(new Student(3, "Anna", 88));
        studentTreeSet.add(new Student(1, "Anna", 88));
        studentTreeSet.add(new Student(5, "Nata", 25));
        studentTreeSet.add(new Student(4, "Anna", 24));
        Iterator<Student> setIterator5 = studentTreeSet.iterator();
        while (setIterator5.hasNext()) {
            System.out.println(setIterator5.next());
        }

    }
}
