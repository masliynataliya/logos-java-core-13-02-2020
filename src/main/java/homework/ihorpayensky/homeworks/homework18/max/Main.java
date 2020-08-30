package homework.ihorpayensky.homeworks.homework18.max;

import java.util.List;
import java.util.Set;

class Main {

    public static void main(String[] args) {

        MyMap<Integer, String> map = new MyMap<>();

        map.add(1, "Hello");
        //map.add(1, "Hello");  Runtime Exception, key duplicate
        map.add(2, "World");
        map.add(3, "Hello");
        map.add(4, "Hello");
        map.add(5, "World");
        map.add(6, "!");

        System.out.println("Before changes: " + map.toString());

        map.removeByKey(1);
        map.removeByValue("World");

        System.out.println("After changes: " + map.toString());

        Set<Integer> integers = map.keySet();
        System.out.println("Set keys: " + integers);

        List<String> values = map.values();
        System.out.println("List values: " +  values);
    }
}
