package homework.mikekhay.hwjavacore13.number1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Faction implements Comparable<Faction> {
    ArrayList<Deputy> deputyList;
    String name;
    Scanner scanner = new Scanner(System.in);

    public Faction(String name) {
        deputyList = new ArrayList<>();
        this.name = name;
    }

    public void factionInfo() {
        System.out.println("Назва фракції : " + name);
        deputyList.sort(Deputy::compareTo);
        for (Deputy d : deputyList) {
            System.out.println(d.toString());
        }
    }

    public void addDeputy() {
        Deputy deputy = new Deputy(0, 0);
        System.out.println("Введіть прізвище депутата:");
        deputy.setSurName(scanner.next());
        System.out.println("Введіть імя депутата:");
        deputy.setName(scanner.next());
        System.out.println("Вкажіть вік депутата:");
        deputy.setAge(scanner.nextInt());
        System.out.println("Вкажіть вагу депутата:");
        deputy.setWeight(scanner.nextInt());
        System.out.println("Вкажіть ріст депутата:");
        deputy.setGrowth(scanner.nextInt());
        System.out.println("Даний депутат хабарник?");
        System.out.println("Введіть true або false?");
        deputy.setBribe(scanner.hasNextBoolean());
        deputyList.add(deputy);
    }

    public void deleteDeputy(String surName) {
        Iterator<Deputy> deputyInteger = deputyList.iterator();
        while (deputyInteger.hasNext()) {
            Deputy deputy = deputyInteger.next();
            if (deputy.getSurName().equalsIgnoreCase(surName)) {
                deputyList.remove(deputy);
                System.out.println("Депутата видалено.");
            }
        }
    }

    public void showBribeTaker() {
        for (Deputy deputy : deputyList) {
            if (deputy.isBribe()) {
                System.out.println(deputy);
            }
        }
    }

    public void clearDeputyList(){
        deputyList.clear();
    }

    public Deputy biggestBribe() {
        Deputy deputy = deputyList.get(0);
        for (Deputy a : deputyList) {
            while (deputy.getSizeBribe() < a.getSizeBribe()) {
                deputy = a;
            }
        }return deputy;
    }

    public ArrayList<Deputy> getDeputyList(){
        return deputyList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Faction{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Faction faction) {
        String name = getName();
        String name2 = faction.getName();
        return name.compareTo(name2);
    }
}

