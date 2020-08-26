package homework.mikekhay.hwjavacore15;

import java.util.*;

public class ZooClab {
    Map<Person, List<Animal>> map = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public Person newPerson() {
        Person person = new Person();
        System.out.println("Введтіть ім'я учасника: ");
        String name = scanner.next();
        System.out.println("Введіть вік учасника: ");
        int age = scanner.nextInt();
        person.setName(name);
        person.setAge(age);
        return person;
    }

    public void addPerson() {
        map.put(newPerson(), new ArrayList<>());
        System.out.println("Учасника додано.");
    }

    public void addAnimal() {
        System.out.println("Введіть ім'я учасника : ");
        String name = scanner.next();
        for (Person person : map.keySet()) {
            if (person.getName().equalsIgnoreCase(name)) {
                map.get(person).add(new Animal());
                System.out.println("Тваринку додано.");
            }
        }
    }

    public void delAnimalwithPerson(){
        System.out.println("Введіть ім'я учасника : ");
        String name = scanner.next();
        for (Person person: map.keySet()) {
            if (person.getName().equalsIgnoreCase(name)){
                System.out.println("Введыть ім'я тваринки яку необхідно видалити: ");
                String namee = scanner.next();
                Iterator<Animal> animalIterator = map.get(person).iterator();
                while (animalIterator.hasNext()){
                    Animal animal = animalIterator.next();
                    if (animal.getNameAnimal().equalsIgnoreCase(namee)){
                        animalIterator.remove();
                        System.out.println("Тваринку видалено.");
                    }
                }
            }
        }
    }

    public void delPerson(){
        System.out.println("Введіть ім'я учасника якого необхідно видалити : ");
        String name = scanner.next();
        Iterator<Person> personIterator = map.keySet().iterator();
        while (personIterator.hasNext()){
            Person person = personIterator.next();
            if (person.getName().equalsIgnoreCase(name)){
                personIterator.remove();
                System.out.println("Учасника видалено.");
            }
        }
    }

    public void delAnimal(){
        System.out.println("Введіть ім'я тваринки яку необхідно видалити : ");
        String name = scanner.next();
        for (Person person: map.keySet()) {
            Iterator<Animal> animalIterator = map.get(person).iterator();
            while (animalIterator.hasNext()){
                Animal animal = animalIterator.next();
                if (animal.getNameAnimal().equals(name)){
                    animalIterator.remove();
                    System.out.println("Тваринку видалено.");
                }
            }
        }
    }

    public void printZooClab(){
        System.out.println(map);
    }
}

