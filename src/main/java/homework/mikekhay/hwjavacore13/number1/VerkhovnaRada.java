package homework.mikekhay.hwjavacore13.number1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VerkhovnaRada {

    public static volatile VerkhovnaRada inst;

    private VerkhovnaRada(){}

    private ArrayList<Faction> factionList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static synchronized VerkhovnaRada getInst(){
        if (inst == null){
            inst = new VerkhovnaRada();
        }
        return inst;
    }

    public void newFaction(){
        System.out.println("Назва фракції: ");
        String name = scanner.next();
            factionList.add(new Faction(name));
            System.out.println("Нову фракцію створено.");
    }

    public void delFaction(){
        System.out.println("Назва фракції яку необхідно видалити: ");
        String name = scanner.next();
        Iterator<Faction> factionIterator = factionList.iterator();
        while (factionIterator.hasNext()){
            Faction faction = factionIterator.next();
            if(faction.getName().equalsIgnoreCase(name)){
                factionIterator.remove();
                System.out.println("Фракцію видалено.");
            }
        }
    }

    public void printFactions(){
        System.out.println(factionList.toString());
    }

    public void clearFaction(){
        System.out.println("Введіть назву фракції яку необхідно очистити : ");
        String name = scanner.next();
        for (Faction faction: factionList) {
            if (faction.getName().equalsIgnoreCase(name)) {
                faction.clearDeputyList();
                System.out.println("Фракцію очищено.");
            }
        }
    }

    public void printFaction(){
        System.out.println("Введіть імя фракції яку необхідно переглянути : ");
        String name = scanner.next();
        for (Faction faction: factionList) {
            if (faction.getName().equalsIgnoreCase(name)) {
                faction.factionInfo();
            }
        }
    }

    public void newDeputyinFaction(){
        System.out.println("Назва фракції у яку добавити депутата : ");
        String name = scanner.next();
        for (Faction faction: factionList) {
            if(faction.getName().equalsIgnoreCase(name)){
                faction.addDeputy();
            }
        }
    }

    public void delDeputyInFaction(){
        System.out.println("Введіть назву фракції у якій видалити депутата : ");
        String name = scanner.next();
        for (Faction faction:factionList) {
            if(faction.getName().equalsIgnoreCase(name));
            System.out.println("Введіть прізвище депутата якого необхідно виключити : ");
            String surName = scanner.next();
            for (Deputy deputy: faction.getDeputyList()) {
                if(deputy.getSurName().equalsIgnoreCase(surName)){
                    faction.deleteDeputy(surName);
                    break;
                }
            }
        }
    }

    public void printBribeTaker(){
        for (Faction faction: factionList) {
            faction.showBribeTaker();
        }
    }

    public void largestBribeTakerOfFaction(){
        Deputy bigBribe = new Deputy(0,0);
        for (Faction faction: factionList) {
            for (Deputy deputy: faction.deputyList) {
                if (faction.biggestBribe().getSizeBribe() < deputy.getSizeBribe()){
                    bigBribe = deputy;
                }
            }
        }
        System.out.println("Найбільший хабарник : " + bigBribe.toString());
    }
}
