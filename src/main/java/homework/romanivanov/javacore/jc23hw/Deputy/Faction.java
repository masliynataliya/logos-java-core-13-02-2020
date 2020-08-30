package homework.romanivanov.javacore.jc23hw.Deputy;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Supplier;

public class Faction implements Comparable<Faction> {
    Scanner sc = new Scanner(System.in);
    ArrayList<Deputy> deputies;
    String name;

    public Faction(String name) {
        deputies = new ArrayList<>();
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public Faction setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Faction{" +
                "name='" + name + '\'' +
                '}';
    }

    public void infoFaction() {
        System.out.println("Ім'я фракції -  '" + name);
        deputies.stream().sorted(Deputy::compareTo).forEach(System.out::println);
    }

    public void addDeputy() {
        deputies.add(createDeputy());
    }

    public Deputy createDeputy() {
        Supplier<Deputy> deputySupplier = () -> {
            System.out.println("Вкажіть вік депутата");
            int age = sc.nextInt();
            System.out.println("Вкажіть вагу депутата");
            int weight = sc.nextInt();
            System.out.println("Вкажіть ріст депутата ");
            int height = sc.nextInt();
            System.out.println("Вкажіть ім'я депутата");
            String name = sc.next();
            System.out.println("Вкажіть прізвище депутата");
            String surName = sc.next();
            System.out.println("Чи є депутат хабарник (true or false)");
            boolean grafter = sc.nextBoolean();
            return new Deputy(age, weight, height, name, surName, grafter);
        };
        return deputySupplier.get();
    }


    public void removeDeputy(String name) {
        boolean yes = true;
        if (deputies.removeIf(deputy -> deputy.getName().equalsIgnoreCase(name))) {
            yes = false;
        }
        if (yes) {
            System.out.println("Такого депутата не існує");
        }
    }


    public void showGrafters() {
        deputies.forEach(deputy -> {
            if (deputy.isGrafter()) {
                System.out.println(deputy);
            }
        });
    }


    public void removeAllDeputies() {
        deputies.clear();
    }


    public void giveBribeToAll() {
        deputies.forEach(Deputy::bribeDeputy);
    }

    public Deputy deputyWithMostBribe() {
        return deputies.stream().max(Deputy::compareTo).orElseThrow(RuntimeException::new);
    }


    @Override
    public int compareTo(Faction faction) {
        String name = getName();
        String name2 = faction.getName();
        return name.compareTo(name2);
    }
}





