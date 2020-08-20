package lesson.example.java.core.lesson15;

import java.util.TreeMap;

public class WorkerMap {

    public static void main(String[] args) {

        TreeMap<Worker, String> map = new TreeMap<>();
        map.put(new Worker("Lida", 450, 56), "Accountant");
        map.put(new Worker("Pavlo", 500, 30), "IT");
        map.put(new Worker("Ivan", 250, 34), "Secretary");

        System.out.println(map);
    }
}
