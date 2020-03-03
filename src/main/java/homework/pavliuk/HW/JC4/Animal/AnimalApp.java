package homework.pavliuk.HW.JC4.Animal;

import homework.pavliuk.HW.JC4.Animal.Animal;

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal1=new Animal();
        System.out.println(animal1.toString());

        System.out.println();



        animal1.setName("Kengu");
        animal1.setAge(10);
        animal1.setSpeed(10);

        System.out.println(animal1.toString());
    }
}

