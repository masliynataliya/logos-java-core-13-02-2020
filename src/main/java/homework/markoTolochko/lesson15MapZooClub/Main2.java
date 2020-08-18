package homework.markoTolochko.lesson15MapZooClub;

import java.util.*;

public class Main2 {


    public static void main(String[] args) {
        Map <Person, List<Animal>> map = new HashMap<>();
        List<Animal> listAnimal = new ArrayList<>();

        while (true) {
            System.out.println("add person to club -- 1");
            System.out.println("add animal to Person -- 2");
            System.out.println("remove animal from Person -- 3");
            System.out.println("remove person from club -- 4");
            System.out.println("remove animal(by name) from all Persons");
            System.out.println("show all zooClub");
            System.out.println("exit");
            Scanner scan = new Scanner(System.in);
            int user = scan.nextInt();

            switch (user){
                case 1:
                    System.out.println("enter name");
                    String namePerson = scan.next();
                    System.out.println("enter age ");
                    Integer agePerson = scan.nextInt();
                    map.put(new Person(namePerson,agePerson), new ArrayList<>());
                    break;
                case 2:
                    System.out.println("enter name who will get pet");
                    String nameGuyWithAnimal = scan.next();
                    System.out.println("enter age that guy ");
                    Integer ageGuyWithAnimal = scan.nextInt();

                    System.out.println("enter animal type ");
                    String animalTypo = scan.next();
                    System.out.println("enter animal name ");
                    String animalName = scan.next();
                    Person person = new Person(nameGuyWithAnimal, ageGuyWithAnimal);
                   // Animal animal = new Animal(animalTypo, animalName);

                    //map.put(new Person(nameGuyWithAnimal, ageGuyWithAnimal), (List<Animal>) new Animal(animalTypo, animalName));
                    map.get(person).add(new Animal(animalTypo, animalName));
                    break;
                case 3:
                    ZooClub zooClub = new ZooClub(map);
                    System.out.println(zooClub);


            }



        }
    }
}