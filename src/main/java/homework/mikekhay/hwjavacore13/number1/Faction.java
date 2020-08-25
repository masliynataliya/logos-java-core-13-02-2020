package homework.mikekhay.hwjavacore13.number1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Faction implements Comparable<Faction> {
    ArrayList<Deputy> deputyList;
    String name;
    Scanner scanner = new Scanner(System.in);

    public Faction(String name) {
        this.deputyList = new ArrayList<>();
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
    }

    public void deleteDeputy(String name) {
        boolean a = true;
        Iterator<Deputy> deputyInteger = deputyList.iterator();
        while (deputyInteger.hasNext()) {
            Deputy d = deputyInteger.next();
            if (d.getName().equalsIgnoreCase(name)) {
                deputyList.remove(d);
                a = false;
            }
        }
        if (a) {
            System.out.println("Такого депутатат немає!!!");
        }
    }

    public void showBribeTaker() {
        for (Deputy deputy : deputyList) {
            if (deputy.isBribe()) {
                System.out.println(deputy);
            }
        }
    }

    public Deputy biggestBribe() {
        Deputy deputy = deputyList.get(0);
        for (Deputy a : deputyList) {
            while (deputy.getSizeBribe() < a.getSizeBribe()) {
                deputy = a;
            }
        }return deputy;
    }

    public void allDeputiesFaction(){
        for (Deputy a:deputyList) {
            a.giveBribeDeputy();
        }
    }

    public ArrayList<Deputy> getDeputyList(){
        return deputyList;
    }

    public void clearDeputyList(){
        deputyList.clear();
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

