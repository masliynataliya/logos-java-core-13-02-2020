package homework.romanivanov.javacore.jc13hw;

import java.util.*;

public class VerkhovnaRada {
    private static volatile VerkhovnaRada instance;
    private ArrayList<Faction> factions = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static synchronized VerkhovnaRada getInstance() {
        if (instance == null) {
            instance = new VerkhovnaRada();
        }
        return instance;
    }

    public void addFaction() {
        System.out.println("Дайте назву фракції");
        String name = sc.next();
        boolean b = true;
        for (Faction f : factions) {
            if (f.getName().equalsIgnoreCase(name)) {
                System.out.println("Така назва фракції вже існує");
                b = false;
            }
        }
        if (b){
            factions.add(new Faction(name));
            System.out.println(factions);
        }
    }

    public void deleteFaction() {
        System.out.println("Напишіть назву фракції яку хоччете видалити");
        String name = sc.next();
        Iterator<Faction> fractionIterator = factions.iterator();
        while(fractionIterator.hasNext()) {
            Faction f = fractionIterator.next();
            if(f.getName().equalsIgnoreCase(name)){
                fractionIterator.remove();
                factions.remove(f);
            }
        }
    }

    public void allFactions() {
        System.out.println(factions.toString());
    }

    public void removeAllDeputiesFromFaction(){
        System.out.println("Введіть ім'я фракції в якій  хочете видалити");
        String number = sc.next();
        for (Faction f: factions){
            if(f.getName().equalsIgnoreCase(number)){
                f.removeAllDeputies();
            }
        }

    }


    public void addDeputyToFaction() {
        System.out.println("Введіть ім'я фракції в яку хочете добавити депутата");
        String name = sc.next();
        for (Faction f: factions){
            if(f.getName().equalsIgnoreCase(name)){
                f.addDeputy();
            }
        }

    }


    public void removeDeputyByName() {
        System.out.println("Виберіть ім'я фракції ї в якій хочете видалити депутата");
        String name = sc.next();
        for (Faction f: factions){
            if(f.getName().equalsIgnoreCase(name)){
                System.out.println("Введіть ім'я депутата якого б хотіли видалити");
                String name1 = sc.next();
                for (Deputy d : f.getDeputies()){
                    if(d.getName().equalsIgnoreCase(name1)){
                        f.removeDeputy(name1);
                        break;

                    }
                }
            }
        }
    }

    public void showGrafters() {
       for (Faction f: factions){
           f.showGrafters();
       }

    }

    public void giveBribeToAll() {
        for(Faction f: factions){
            f.giveBribeToAll();
        }
    }





    public void showFaction() {
        System.out.println("виберіть ім'я фракції яку хочете подивитись");
        String name = sc.next();
        for (Faction f: factions){
            if (f.getName().equalsIgnoreCase(name)){
                f.infoFaction();
            }
        }

        }
        public void deputyWithMostBribeFactions(){
        Deputy biggestBriber = new Deputy(0,0);
        for (Faction f: factions){
            for (Deputy d : f.deputies){
                if (f.deputyWithMostBribe().getBribe() < d.getBribe()){
                    biggestBriber = d;
                }
            }
            }
            System.out.println(biggestBriber.toString() + " Найбільший хабарник");
        }

    }



