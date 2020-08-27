package homework.mikekhay.hwjavacore14;

import java.util.Comparator;

public class SortComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog dog, Dog t1) {

            int age1 = dog.getAge();
            int age2 = t1.getAge();

            String name1=dog.getName();
            String name2=t1.getName();

            if (age1 > age2){
                return 1;
            }
            if (age1 < age2){
                return -1;
            }
            else {
                return name1.compareTo(name2);
            }
        }
    }
