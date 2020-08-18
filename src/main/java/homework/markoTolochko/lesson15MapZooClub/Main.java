//package homework.markoTolochko.lesson15MapZooClub;
//import lesson.example.java.core.lesson15.MapApp;
//import lesson.example.java.core.lesson15.StudentUKU;
//import java.util.*;
//public class Main {
//
//    public static void main(String[] args) {
//        List<Animal> listAnimal = new ArrayList<>();
//        List<Person> listPerson = new ArrayList<>();
//        Map<Person, List<Animal>> map = new HashMap<>();
//        while (true) {
//            System.out.println("add person to club -- 1");
//            System.out.println("add animal to Person -- 2");
//            System.out.println("remove animal from Person -- 3");
//            System.out.println("remove person from club -- 4");
//            System.out.println("remove animal(by name) from all Persons");
//            System.out.println("show all zooClub");
//            System.out.println("exit");
//            Scanner scan = new Scanner(System.in);
//            int user = scan.nextInt();
//
//            switch (user) {
//                case 1:
//                    System.out.println("enter name ");
//                    String name = scan.next();
//                    System.out.println("enter age ");
//                    Integer age = scan.nextInt();
//                    Person person = new Person(name, age);
//
//                    break;
//                case 2:
//                    System.out.println("enter person name and age to add him animal ");
//                    System.out.println(listPerson);
//                    System.out.println("name");
//                    String personName= scan.next();
//                    System.out.println("age");
//                    Integer personAge = scan.nextInt();
//                    Person personAnimal = new Person(personName, personAge );
//                    map.put(personAnimal, listAnimal);
//                    System.out.println("enter animalType ");
//                    String animalType = scan.next();
//                    System.out.println("enter animal name ");
//                    String animalName = scan.next();
//                    Animal animal = new Animal(animalType, animalName);
//                    listAnimal.add(animal);
//
//                    break;
//                case 3:
//                    System.out.println("enter animal type and name to remove ");
//                    System.out.println(listAnimal);
//                    System.out.println("animal type");
//                    String animalTypeToRemove = scan.next();
//                    System.out.println("animal name");
//                    String animalNameToRemove = scan.next();
//                    Animal animalToRemove = new Animal(animalTypeToRemove, animalNameToRemove);
//                    listAnimal.remove(animalToRemove);
//                    break;
//                case 4:
//                    //System.out.println(map);
//                    Set<Map.Entry<Person, List<Animal>>> entries = map.entrySet();
//                    System.out.println(entries.toString());
//
//            }
//        }
//    }
//}
