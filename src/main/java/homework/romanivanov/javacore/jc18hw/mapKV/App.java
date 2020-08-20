package homework.romanivanov.javacore.jc18hw.mapKV;

import java.util.HashMap;
import java.util.Map;

public class App {
    Map<String, Integer> jepa = new HashMap<>();

    public static void main(String[] args) {

        MyMap<String, Integer> myMap = new MyMap<>();
        myMap.put("Brest",23);
        myMap.put("Sekh", 25);
        myMap.put("Sekh", 25);
        myMap.put("Sekh", 25);
        myMap.put("Morshinska", 27);
        myMap.put("Sekh", 27); //1 завдання
//        myMap.removeByKey("Jepa"); //2 завдання
//        myMap.removeByValue(27); ////3 завдання
        myMap.setKey(); //4 завдання
        myMap.listValue(); //5 завдання
        System.out.println(myMap.toString()); // 6 завдання




    }


}
