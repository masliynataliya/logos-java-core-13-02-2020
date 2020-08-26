package homework.mikekhay.hwjavacore14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class AppDog {
    public static void main(String[] args) {
        HashSet<Dog> dogs = new HashSet<>();
        dogs.add(new Dog("Barsik",5));
        dogs.add(new Dog("Sharik",7));
        dogs.add(new Dog("Browko",3));
        dogs.add(new Dog("Jac",9));
        dogs.add(new Dog("Sirko",4));
        dogs.add(new Dog("Dina",9));


        Iterator<Dog> iterator = dogs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        List<Dog> sortList = new ArrayList<>(dogs);
        sortList.sort(Dog::compareTo);

        Iterator<Dog> iterator1 = sortList.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
