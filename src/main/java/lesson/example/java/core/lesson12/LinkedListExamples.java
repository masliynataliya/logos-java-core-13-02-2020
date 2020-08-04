package lesson.example.java.core.lesson12;

import java.util.LinkedList;

public class LinkedListExamples {

    public static void main(String[] args) {

        LinkedList list3 = new LinkedList();
        System.out.println(list3.isEmpty());
        list3.add("test1");
        list3.add("test2");
        list3.add("test3");
        System.out.println(list3);

        System.out.println(list3.get(1));

        System.out.println(list3.isEmpty());
    }
}
