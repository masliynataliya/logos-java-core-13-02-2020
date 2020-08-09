package lesson.example.java.core.lesson13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.stream.Stream;

public class IteratorApp {

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


        // не надійний варіант видалення
//        for (int i = 0; i < stringArrayList.size(); i++) {
//            if (stringArrayList.get(i).equalsIgnoreCase("monday")) {
//                stringArrayList.remove(i);
//            }
//        }

        // цей спосіб взагалі не працює бо виникає помилка))
//        for (String element : stringArrayList) {
//            if (element.equalsIgnoreCase("monday")) {
//                stringArrayList.remove(element);
//            }
//        }

//        Iterator<String> iterator = stringArrayList.iterator();
//
//        while (iterator.hasNext()) {
//            String day = iterator.next();
//            if (day.equalsIgnoreCase("monday")) {
//                iterator.remove();
//            }
//        }
//
//        Iterator<String> iterator2 = stringArrayList.iterator();
//        while (iterator2.hasNext()) {
//            System.out.println(iterator2.next());
//        }

        ListIterator<String> listIterator = stringArrayList.listIterator();

        while (listIterator.hasNext()) {
            String day = listIterator.next();
            if (day.equalsIgnoreCase("Tuesday")) {
                listIterator.previous();
            }
            System.out.println(day);
        }
        System.out.println();
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
