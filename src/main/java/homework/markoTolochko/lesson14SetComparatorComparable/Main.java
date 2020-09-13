package homework.markoTolochko.lesson14SetComparatorComparable;

import homework.markoTolochko.phoneBook.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<SetComapare> hashSet = new HashSet<>();
        hashSet.add(new SetComapare());
        System.out.println(hashSet);
        System.out.println();
        System.out.println(hashSet.size());
    }
}
