package lesson.example.java.core.lesson03;

public class Application {

    public static void main(String[] args) {

        Animal catAnimal = new Animal("Cat");
        System.out.println(catAnimal);

        Animal homeCat = new Animal("Cat", 12);
        System.out.println(homeCat);

        Animal dou = new Animal();
        System.out.println(dou);

        String douType = dou.getType();
        System.out.println(douType);

        dou.setType("Dog");
        System.out.println(dou);
        System.out.println(homeCat);
        System.out.println(catAnimal);

        // Object interaction
        Person p1 = new Person("Katya", "0931234567");
        Person p2 = new Person("Natalia", "06312346512");

        p1.callOtherPerson(p2);
        p2.callOtherPerson(p1);
    }
}
