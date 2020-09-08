package homework.romanivanov.javacore.jc23hw.ZooClub;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ZooClub {
    Scanner sc = new Scanner(System.in);
    Map<Person, List<Animal>> map = new HashMap<>();

    public void addPerson() {
        Supplier<Person> personSupplier = () -> {
            System.out.println("Введіть ім'я для людини");
            String name = sc.next();
            System.out.println("Введіть вік людини");
            int age = sc.nextInt();
            return new Person(name, age);
        };
        map.put(personSupplier.get(), new ArrayList<>());
        System.out.println(map);
    }

    public void removeSpecificAnimalFromAll() {
        System.out.println("Введіть тип тваринки який хочете видалити");
        String name = sc.next();
        AtomicBoolean yes = new AtomicBoolean(true);
        map.keySet().forEach(person -> map.get(person).removeIf(animal -> {
            yes.set(false);
            return animal.getTypeOfAnimal().equalsIgnoreCase(name);
        }));
        if (yes.get()) {
            System.out.println("Такого типу тваринок не існує");
            //Чи можна якось зробити перевірку без використання Атоміків?
        }
    }

    public void removeAnimalFromList() {
        System.out.println("Введіть ім'я власника");
        String name = sc.next();
        List<Person> namePerson = map.keySet()
                .stream()
                .filter(person -> person.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
        if (!namePerson.isEmpty()) {
            namePerson.forEach(person -> {
                        System.out.println("Введіть ім'я тваринки яку хочете видалити");
                        String name1 = sc.next();
                        boolean b = map.get(person).removeIf(animal -> animal.getName().equalsIgnoreCase(name1));
                        if (!b) {
                            System.out.println("Такої тваринки не існує");
                        }
                    }
            );
        } else System.out.println("Такої людини не існує");
        System.out.println(map);
    }

    public void removePerson() {
        System.out.println("Введіть ім'я участника клубу якого ви хочете видалити");
        String name = sc.next();
        boolean b = map.keySet().removeIf(person -> person.getName().equalsIgnoreCase(name));
        if (!b) {
            System.out.println("Такої людини з таким іменем не існує");
        }
    }

    public void showZooClub() {
//        int c = map.keySet().stream()
//                .map(person -> map.get(person)
//                .size())
//                .collect(Collectors.toList())
//                .stream()
//                .mapToInt(Integer::intValue)
//                .sum();
        int count = map.keySet().stream().mapToInt(person -> map.get(person).size()).sum();
        System.out.println("Кількість учасників: " + map.keySet().size());
        System.out.println("Кількість тваринок: " + count);
        System.out.println(map.entrySet());

    }


    public void addAnimals() {
        System.out.println("Введіть ім'я людини");
        String name = sc.next();
        boolean y = map.keySet()
                .stream()
                .filter(person -> person.getName().equalsIgnoreCase(name))
                .anyMatch(person -> map.get(person).add(new Animal()));
        if (!y) {
            System.out.println("Людини з таким імене не існує");
        }
    }
}

