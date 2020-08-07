package lesson.example.java.core.lesson14;

import java.util.Iterator;
import java.util.PriorityQueue;
import lesson.example.java.core.lesson13.Student;

public class QueueApp {

    public static void main(String[] args) {

        PriorityQueue queue = new PriorityQueue();
        queue.add(new Student(3, "Anna", 23));
        queue.add(new Student(3, "Anna", 88));
        queue.add(new Student(3, "Anna", 88));
        queue.add(new Student(5, "Nata", 25));
        queue.add(new Student(4, "Anna", 24));

        Iterator<Student> queueIterator = queue.iterator();
        while ( queueIterator.hasNext()) {
            System.out.println(queueIterator.next());
        }

        queue.remove();
        queue.poll();
        System.out.println();
        Iterator<Student> queueIterator1 = queue.iterator();
        while ( queueIterator1.hasNext()) {
            System.out.println(queueIterator1.next());
        }
    }
}
