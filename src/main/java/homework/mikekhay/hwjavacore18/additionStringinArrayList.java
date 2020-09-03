package homework.mikekhay.hwjavacore18;

import java.util.ArrayList;
import java.util.List;

public class additionStringinArrayList {
        public static void addToList(List list) {
            list.add("Text0123");
            list.add("Test2020");
        }

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            addToList(list);
            System.out.println(list.get(0));
            System.out.println(list.get(1));

        }
    }

