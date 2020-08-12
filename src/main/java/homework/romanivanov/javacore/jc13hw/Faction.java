package homework.romanivanov.javacore.jc13hw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Faction implements Comparator<Faction> {
    Scanner sc = new Scanner(System.in);
    ArrayList<Deputy> deputies;
    String name;

    public Faction() {
        deputies = new ArrayList<>();
    }

    public Faction(String name) {
        deputies = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<Deputy> getDeputies() {
        return deputies;
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
        deputies.sort(Deputy::compareTo);
        for (Deputy e : deputies) {
            System.out.println(e.toString());
        }
    }

    public void addDeputy() {
        Deputy deputy = new Deputy(0, 0);
        System.out.println("Вкажіть вік депутата");
        deputy.setAge(sc.nextInt());
        System.out.println("Вкажіть вагу депутата");
        deputy.setWeight(sc.nextInt());
        System.out.println("Вкажіть ріст депутата ");
        deputy.setHeight(sc.nextInt());
        System.out.println("Вкажіть ім'я депутата");
        deputy.setName(sc.next());
        System.out.println("Вкажіть прізвище депутата");
        deputy.setSurname(sc.next());
        System.out.println("Чи є депутат хабарник (true or false)");
        deputy.setGrafter(sc.nextBoolean());
        deputies.add(deputy);
    }

    public void removeDeputy(String name) {
        Iterator<Deputy> deputyIterator = deputies.iterator();
        while (deputyIterator.hasNext()) {
            Deputy d = deputyIterator.next();
            if (d.getName().equalsIgnoreCase(name)) {
                deputyIterator.remove();
                deputies.remove(d);
            }else {
                System.out.println("Такого депутата не існує");
            }
        }

    }

    public void showGrafters() {
       for (Deputy d: deputies) {
           if (d.isGrafter()) {
               System.out.println(d);
           }
       }
    }


    public void removeAllDeputies() {
        deputies.clear();

    }


    public void giveBribeToAll() {
        for (Deputy d : deputies) {
            d.bribeDeputy();
        }
    }

    public Deputy deputyWithMostBribe() {
        Deputy deputy = deputies.get(0);
        for (Deputy d: deputies) {
            if (deputy.getBribe() < d.getBribe()) {
                deputy = d;
            }
       }
        return deputy;
    }




    @Override
    public int compare(Faction faction, Faction faction1) {
        String name = faction.getName();
        String name2 = faction1.getName();
        return name.compareTo(name2);
    }
}





