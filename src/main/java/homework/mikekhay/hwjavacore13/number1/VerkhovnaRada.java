package homework.mikekhay.hwjavacore13.number1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VerkhovnaRada {

    public static volatile VerkhovnaRada instance;

    private VerkhovnaRada(){}

    private ArrayList<Faction> factions = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public  static synchronized VerkhovnaRada getInstance(){
        if (instance == null){
            instance = new VerkhovnaRada();
        }
        return instance;
    }

    public void newFaction(){
        System.out.println("Назва фракції: ");
        String name = scanner.nextLine();
        boolean j = true;
        for (Faction f: factions) {
            if (f.getName().equalsIgnoreCase(name)){
                System.out.println("Така фракція вже існує");
                j = false;
            }
        }
        if (j){
            factions.add(new Faction(name));
            System.out.println("Нову фракцію створено.");
        }
    }

    public void delFaction(){
        System.out.println("Назва фракції яку необхідно видалити: ");
        String name = scanner.nextLine();
        Iterator<Faction> factionIterator = factions.iterator();
        while (factionIterator.hasNext()){
            Faction f = factionIterator.next();
            if(f.getName().equalsIgnoreCase(name)){
                factionIterator.remove();
            }
        }
    }

    public void printFactions(){
        System.out.println(factions.toString());
    }

    public void clearFaction(){
        System.out.println("Введіть назву фракції яку необхідно очистити : ");
        String name = scanner.nextLine();
        for (Faction f: factions) {
            if(f.getName().equalsIgnoreCase(name));
            f.clearDeputyList();
        }
        System.out.println("Фракцію очищено.");
    }

    public void printFaction(){
        System.out.println("Введіть імя фракції яку необхідно переглянути : ");
        String name = scanner.nextLine();
        for (Faction f: factions) {
            if (f.getName().equalsIgnoreCase(name)) {
                f.factionInfo();
            }
        }
    }

    public void newDeputyinFaction(){
        System.out.println("Назва фракції у яку добавити депутата : ");
        String name = scanner.nextLine();
        for (Faction f: factions) {
            if(f.getName().equalsIgnoreCase(name)){
                f.addDeputy();
            }
        }
    }
    public void delDeputyInFaction(){
        System.out.println("Введіть назву фракції у якій видалити депутата : ");
        String name = scanner.nextLine();
        for (Faction f:factions) {
            if(f.getName().equalsIgnoreCase(name));
            System.out.println("Введіть прізвище депутата якого необхідно виключити : ");
            String namee = scanner.nextLine();
            for (Deputy d: f.getDeputyList()) {
                if(d.getSurName().equalsIgnoreCase(namee)){
                    f.deleteDeputy(namee);
                    break;
                }
            }
        }
    }

    public void bribersDeputy(){
        for (Faction f: factions) {
            f.showBribeTaker();
        }
    }

    public void briberDeputy(){
        for (Faction f: factions) {
            f.biggestBribe();
        }
    }
}
