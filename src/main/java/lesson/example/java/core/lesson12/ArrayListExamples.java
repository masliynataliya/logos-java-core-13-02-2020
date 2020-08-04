package lesson.example.java.core.lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lesson.example.java.core.lesson11.Person;

public class ArrayListExamples {

    public static void main(String[] args) {

        List list1 = new ArrayList();
        list1.add("Text");
        list1.add(123);
        list1.add(new Person("Test Person"));
        System.out.println("List1: " + list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("qwertyu");
        list2.add("1234567");
        System.out.println("List2: " + list2);
        list2.add(0, "New");
        System.out.println("List2 after add to Index: " + list2);

        System.out.println(list2.size());

        list2.sort(Collections.reverseOrder());
        System.out.println(list2);

        list1.addAll(list2);
        System.out.println(list1);

        System.out.println(list1.contains("New"));

        list1.add("New");
        list1.add("New");
        System.out.println(list1);
        System.out.println(list1.indexOf("New"));
        System.out.println(list1.lastIndexOf("New"));

        list1.removeAll(list2);
        System.out.println(list1);
    }
}
