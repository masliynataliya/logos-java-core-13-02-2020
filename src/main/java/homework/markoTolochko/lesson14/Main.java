package homework.markoTolochko.lesson14;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Person> personHashSet = new HashSet<>();
        personHashSet.add(new Person("bob",20));
        personHashSet.add(new Person("jack",22));
        personHashSet.add(new Person("anna",11));
        personHashSet.add(new Person("robert",19));
        personHashSet.add(new Person("mike",18));
        personHashSet.add(new Person("jony",32));
        personHashSet.add(new Person("ed",52));
        personHashSet.add(new Person("karla",72));
        personHashSet.add(new Person("sergio",102));

        Iterator<Person> iterator = personHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        ArrayList<Person> arrayListPerson = new ArrayList<>(personHashSet);
        arrayListPerson.sort(new PersonComparator());
        Iterator<Person> iterator2 = arrayListPerson.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        System.out.println();


    }
}
