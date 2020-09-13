package homework.markoTolochko.lesson14;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        String personName1 = person1.getName();
        String personName2 = person2.getName();
        int personAge1 = person1.getAge();
        int personAge2 = person2.getAge();
        if(personName1.compareTo(personName2)!=0){
            return personName1.compareTo(personName2);
        }
        else if (personAge1 > personAge2){
            return 1;
        }
        else if (personAge1 < personAge2){
            return -1;
        }
        else{
            return 0;
        }
    }
}
