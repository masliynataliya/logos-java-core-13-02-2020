package homework.romanivanov.javacore.jc15hw;

import java.util.*;

public class ZooClub {
    Scanner sc = new Scanner(System.in);
    Map<Person, List<Animal>> map = new HashMap<>();


    public Person createPerson() {
        Person person = new Person();
        System.out.println("Введіть ім'я для людини");
        String name = sc.next();
        System.out.println("Введіть вік людини");
        int age = sc.nextInt();
        person.setName(name);
        person.setAge(age);
        return person;
    }


    public void addPerson() {
        map.put(createPerson(), new ArrayList<>());
        System.out.println(map);


    }


    public void removeSpecificAnimalFromAll() {
        System.out.println("Введіть тип тваринки який хочете видалити");
        boolean yes = true;
        String name = sc.next();
        for (Person d : map.keySet()) {
            Iterator<Animal> animalIterator = map.get(d).iterator();
            while (animalIterator.hasNext()) {
                Animal a = animalIterator.next();
                if (a.getTypeOfAnimal().equals(name)) {
                    animalIterator.remove();
                    yes = false;
                    break;

                }
            }

        }
        if (yes) {
            System.out.println("Такого типу тварини не було знайдено");
        }
    }

    public void removeAnimalFromList() {

        System.out.println("Введіть ім'я власника");
        String name = sc.next();
        for (Person d : map.keySet()) {
            if (d.getName().equalsIgnoreCase(name)) {
                System.out.println("Введіть ім'я тваринки яку хочете видалити");
                String name1 = sc.next();
                Iterator<Animal> animalIterator = map.get(d).iterator();
                while (animalIterator.hasNext()) {
                    Animal a = animalIterator.next();
                    if (a.getName().equalsIgnoreCase(name1)) {
                        animalIterator.remove();
                        break;
                    } else System.out.println("Такого імені тварини не існує");

                }
            }
        }
        System.out.println(map);
    }

    public void removePerson() {
        System.out.println("Введіть ім'я участника клубу якого ви хочете видалити");
        boolean yes = true;
        String name = sc.next();
        Iterator<Person> personIterator = map.keySet().iterator();
        while (personIterator.hasNext()) {
            Person p = personIterator.next();
            if (p.getName().equalsIgnoreCase(name)) {
                personIterator.remove();
                yes = false;
                break;

            }
        }
        if (yes) {
            System.out.println("Людини з таким іменем не існує");
        }
    }


    public void showZooClub() {
        int i = 0;
        for (Person p : map.keySet()) {
            i = i + map.get(p).size();
        }
        System.out.println("Кількість учасників: " + map.keySet().size());
        System.out.println("Кількість тваринок: " + i);
        System.out.println(map.entrySet());

    }


    public void addAnimals() {
        System.out.println("Введіть ім'я людини");
        boolean y = false;
        String name = sc.next();
        for (Person p : map.keySet()) {
            if (p.getName().equalsIgnoreCase(name)) {
                map.get(p).add(new Animal());
                y = true;
                System.out.println(map);
            }

        }
        if (!y) {
            System.out.println("Людини з таким іменем не знайдено");
        }
    }
}

