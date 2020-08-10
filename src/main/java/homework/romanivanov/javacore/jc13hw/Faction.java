package homework.romanivanov.javacore.jc13hw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Faction implements Comparator<Deputy> {
    Scanner sc = new Scanner(System.in);

    public Deputy addDeputy() {
        Deputy deputy = new Deputy(0, 0);
        System.out.println("Вік");
        deputy.setAge(sc.nextInt());
        System.out.println("Вагу");
        deputy.setWeight(sc.nextInt());
        System.out.println("Ріст");
        deputy.setHeight(sc.nextInt());
        System.out.println("Ім'я");
        deputy.setName(sc.next());
        System.out.println("Прізвище");
        deputy.setSurname(sc.next());
        System.out.println("Хабарник (true or false)");
        deputy.setGrafter(sc.nextBoolean());
        return deputy;
    }

    public void removeDeputy(ArrayList<Deputy> deputies) {
        System.out.println("Введіть індекс депутата");
        int number = sc.nextInt();
        for (int i = 0; i < deputies.size(); i++) {
            if (deputies.get(i) == deputies.get(number)) {
                deputies.remove(i);
            }
        }
    }

    public void showGrafters(ArrayList<Deputy> deputies) {
        for (int i = 0; i < deputies.size(); i++) {
            if (deputies.get(i).isGrafter()) {
                System.out.println(deputies.get(i));
            }
        }
    }

    public void showFaction(ArrayList<ArrayList<Deputy>> factions) {
        System.out.println("виберіть індекс фракції яку хочете подивитись");
        int number = sc.nextInt();
        for (int i = 0; i < factions.size(); i++) {
            if (number == i) {
                System.out.println(factions.get(i).toString());
            }
        }
    }

    public void removeDeputyByIndex(ArrayList<Deputy> deputies) {
        deputies.remove(sc.nextInt());
    }

    public void allDeputies(ArrayList<Deputy> deputyArrayList1) {
        System.out.println(deputyArrayList1.toString());
    }

    public void removeAllDeputies(ArrayList<ArrayList<Deputy>> factions) {
        System.out.println("виберіть індекс фракції яку хочете видалити");
        int number = sc.nextInt();
        for (int i = 0; i < factions.size(); i++) {
            if (number == i) {
                factions.get(i).clear();
            }
        }
    }

    public void giveBribeToAll(ArrayList<Deputy> deputies) {
        for (Deputy d : deputies) {
            d.bribeDeputy();
        }
    }

    public Deputy deputyWithMostBribe(ArrayList<Deputy> deputies) {
        Deputy deputy1 = new Deputy(0, 0);
        int deputy = 0;
        for (int i = 0; i < deputies.size(); i++) {
            if (deputy < deputies.get(i).getBribe()) {
                deputy = deputies.get(i).getBribe();
                deputy1 = deputies.get(i);

            }
        }
        return deputy1;
    }

    public void compareDeputy(ArrayList<ArrayList<Deputy>> factions) {
        Faction faction = new Faction();
        ArrayList<Deputy> deputies = new ArrayList<>();
        Deputy deputy;
        for (int i = 0; i < factions.size(); i++) {
            deputy = faction.deputyWithMostBribe(factions.get(i));
            deputies.add(deputy);
        }
        System.out.println(faction.deputyWithMostBribe(deputies).toString());
    }

    @Override
    public int compare(Deputy deputy, Deputy deputy1) {
        int deputy1Bribe = deputy.getBribe();
        int deputy2Bribe = deputy1.getBribe();
        if (deputy1Bribe > deputy2Bribe) {
            return 1;
        }
        if (deputy1Bribe < deputy2Bribe) {
            return -1;
        } else return 0;

    }
}






