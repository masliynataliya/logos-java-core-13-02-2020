package homework.romanivanov.javacore.jc12hw;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("Roma");
        arrayList.add(0,true);
        System.out.println(arrayList.toString());
        arrayList.remove(0);
        arrayList.remove("Roma");
        System.out.println(arrayList.toString());


    }


}
