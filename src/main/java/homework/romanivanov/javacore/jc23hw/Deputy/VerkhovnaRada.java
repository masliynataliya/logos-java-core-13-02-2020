package homework.romanivanov.javacore.jc23hw.Deputy;

import java.util.ArrayList;
import java.util.Scanner;

public class VerkhovnaRada {
    private static volatile VerkhovnaRada instance;
    Scanner sc = new Scanner(System.in);
    private final ArrayList<Faction> factions = new ArrayList<>();
    private VerkhovnaRada() {
    }

    public static synchronized VerkhovnaRada getInstance() {
        if (instance == null) {
            instance = new VerkhovnaRada();
        }
        return instance;
    }

    public void addFaction() {
        System.out.println("Дайте назву фракції");
        String name = sc.next();
        boolean b = factions.stream().filter(faction -> faction.getName().equalsIgnoreCase(name))
                .noneMatch(faction -> factions.add(new Faction(name)));
        if (!b) {
            System.out.println("Така назва фракції вже існує");
        }
    }

    public void deleteFaction() {
        System.out.println("Напишіть назву фракції яку хоччете видалити");
        String name = sc.next();
        factions.removeIf(faction -> faction.getName().equalsIgnoreCase(name));
    }

    public void allFactions() {
        System.out.println(factions.toString());
    }

    public void removeAllDeputiesFromFaction() {
        System.out.println("Введіть ім'я фракції в якій  хочете видалити");
        String name = sc.next();
        factions.forEach(faction -> {
            if (faction.getName().equalsIgnoreCase(name)) {
                faction.removeAllDeputies();
            }
        });
    }


    public void addDeputyToFaction() {
        System.out.println("Введіть ім'я фракції в яку хочете добавити депутата");
        String name = sc.next();
        factions.forEach(faction -> {
            if (faction.getName().equalsIgnoreCase(name)) {
                faction.addDeputy();
            }
        });
    }


    public void removeDeputyByName() {
        System.out.println("Виберіть ім'я фракції ї в якій хочете видалити депутата");
        String name = sc.next();
        factions.stream()
                .filter(faction -> faction.getName().equalsIgnoreCase(name))
                .forEach(faction -> {
                    System.out.println("Введіть ім'я депутата якого б хотіли видалити");
                    String name1 = sc.next();
                    faction.removeDeputy(name1);
                });

    }

    public void showGrafters() {
        factions.forEach(Faction::showGrafters);
    }

    public void giveBribeToAll() {
        factions.forEach(Faction::giveBribeToAll);
    }


    public void showFaction() {
        System.out.println("виберіть ім'я фракції яку хочете подивитись");
        String name = sc.next();
        factions.forEach(faction -> {
            if (faction.getName().equalsIgnoreCase(name)) {
                faction.infoFaction();
            }
        });

    }

    public void deputyWithMostBribeFactions() {
        Deputy deputy = factions.stream()
                .map(Faction::deputyWithMostBribe)
                .max(Deputy::compareTo)
                .orElseThrow(RuntimeException::new);
        System.out.println(deputy.toString() + " Найбільший хабарник");
    }

}


