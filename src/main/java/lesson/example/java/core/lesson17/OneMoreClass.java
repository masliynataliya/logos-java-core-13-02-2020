package lesson.example.java.core.lesson17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OneMoreClass {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("qwerty", 1);
        map.put("ytrewq", 2);

        // внутрішній інтерфейс Entry в інтеріейсі Map
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
    }
}
