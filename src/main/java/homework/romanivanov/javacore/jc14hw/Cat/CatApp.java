package homework.romanivanov.javacore.jc14hw.Cat;

import java.util.*;

public class CatApp{
    public static void main(String[] args) {
        HashSet<Cat> cats = new HashSet<>();
        cats.add(new Cat(30, "Murko"));
        cats.add(new Cat(30,"Barsik"));
        cats.add(new Cat(24,"Barsik"));
        cats.add(new Cat(10,"Dusya"));
        cats.add(new Cat(50,"Akrobat"));
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
        System.out.println("");
        List<Cat> sortedList = new ArrayList<>(cats);
        sortedList.sort(Cat::compareTo);

        Iterator<Cat> iterator1 = sortedList.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }












        }



    }


