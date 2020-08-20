package lesson.example.java.core.lesson15;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapApp {

    public static void main(String[] args) {

        Map<String, Integer> workersAndWages = new LinkedHashMap<>();
        workersAndWages.put("Steve", 100);
        workersAndWages.put("Anna", 120);
        workersAndWages.put("Christie", 100);
        workersAndWages.put("Matt", 130);
        workersAndWages.put("Bruce", 200);
        workersAndWages.put("David", 50);

        printMap(workersAndWages);

        if (!workersAndWages.containsKey("Anna")){
            workersAndWages.put("Anna", 220);
            printMap(workersAndWages);
        }

        workersAndWages.putIfAbsent("Eva", 330);
        printMap(workersAndWages);

        System.out.println(workersAndWages.get("Matt"));
        System.out.println(workersAndWages.getOrDefault("Steven", 999));

        System.out.println(workersAndWages.containsValue(250));

        System.out.println(workersAndWages.keySet());
        System.out.println(workersAndWages.values());

        System.out.println(workersAndWages.size());
        workersAndWages.clear();
        printMap(workersAndWages);
    }

    public static void printMap(Map map) {
        if (map.isEmpty()) {
            System.out.println("Map is Empty");
        }
        Set<Entry<String, Integer>> entries = map.entrySet();
        Iterator<Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
