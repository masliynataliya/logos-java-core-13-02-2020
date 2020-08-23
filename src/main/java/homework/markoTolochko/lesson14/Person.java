package homework.markoTolochko.lesson14;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person otherPerson) {
        String personName1 = this.getName();
        String personName2 = otherPerson.getName();
        int personAge1 = this.getAge();
        int personAge2 = otherPerson.getAge();

        if (personName1.compareTo(personName2) != 0) {
            return personName1.compareTo(personName2);
        }
        else {
            if (personAge1 > personAge2){
                return 1;
            }
            else if (personAge1 < personAge2){
                return -1;
            }
            else {
                return 0;
            }
        }


    }
}
