package homework.romanivanov.javacore.jc13hw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class VerkhovnaRada implements Comparator<ArrayList<Deputy>> {
    private static volatile VerkhovnaRada instance;
    Scanner sc = new Scanner(System.in);
    Faction faction = new Faction();

    public static synchronized VerkhovnaRada getInstance() {
        if (instance == null) {
            instance = new VerkhovnaRada();
        }
        return instance;
    }

    public void addFaction(ArrayList<ArrayList<Deputy>> factions) {
        factions.add(new ArrayList<Deputy>());

    }

    public void deleteFaction(ArrayList<ArrayList<Deputy>> factions) {
        System.out.println("Виберіть індекс фракції яку хочете видалити");
        factions.remove(sc.nextInt());
    }

    public void allFactions(ArrayList<ArrayList<Deputy>> factions) {
        System.out.println(factions.toString());
    }


    public void addDeputyToFaction(ArrayList<ArrayList<Deputy>> factions) {
        System.out.println("Виберіть індекс фракції в яку хочете добавити депутата");
        int number = sc.nextInt();
        for (int i = 0; i < factions.size(); i++) {
            if (factions.get(number) == factions.get(i)) {
                factions.get(i).add(faction.addDeputy());
            }
        }

    }

    public void removeDeputyByIndex(ArrayList<ArrayList<Deputy>> factions) {
        System.out.println("Виберіть індекс фракції в якій хочете видалити депутата");
        int number = sc.nextInt();
        for (int i = 0; i < factions.size(); i++) {
            if (factions.get(number) == factions.get(i)) {
                System.out.println(factions.get(i));
                faction.removeDeputy(factions.get(i));
            }
        }
    }

    public void showGrafters(ArrayList<ArrayList<Deputy>> factions) {
        for (int i = 0; i < factions.size(); i++) {
            faction.showGrafters(factions.get(i));
        }

    }

    public void giveBribeToAll(ArrayList<ArrayList<Deputy>> factions) {
        for (int i = 0; i < factions.size(); i++) {
            faction.giveBribeToAll(factions.get(i));
        }
    }


    public void compareDeputy(ArrayList<ArrayList<Deputy>> factions) {
        for (int i = 0; i < factions.size(); i++) {
//            faction.deputyWithMostBribe(factions.get(i));
            System.out.println(faction.deputyWithMostBribe(factions.get(i)).toString());
        }
    }

    @Override
    public int compare(ArrayList<Deputy> deputies, ArrayList<Deputy> deputyArrayList) {
        int bribe1 = faction.deputyWithMostBribe(deputies).getBribe();
        int bribe2 = faction.deputyWithMostBribe(deputyArrayList).getBribe();
        if (bribe1 > bribe2) {
            return 1;
        }
        if (bribe1 < bribe2) {
            return -1;
        } else return 0;
    }
}

