package homework.romanivanov.javacore.jc13hw;

import java.util.ArrayList;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Faction faction = new Faction();
        VerkhovnaRada verkhovnaRada = new VerkhovnaRada();
        ArrayList<ArrayList<Deputy>> factions = new ArrayList<>();
        boolean go = true;
        info();
        while (go) {
            System.out.println("Choose option");
            int choose = sc.nextInt();
            switch (choose) {

                case 1:
                    verkhovnaRada.addFaction(factions);
//                    System.out.println(factions.toString());
                    break;
                case 2:
                    verkhovnaRada.deleteFaction(factions);
                    break;

                case 3:
                    verkhovnaRada.allFactions(factions);
                    break;
                case 4:
                    faction.removeAllDeputies(factions);
                    break;
                case 5:
                    faction.showFaction(factions);

                    break;
                case 6:
                    verkhovnaRada.addDeputyToFaction(factions);
                    System.out.println(factions.toString());
                    break;
                case 7:
                    verkhovnaRada.removeDeputyByIndex(factions);
                    break;
                case 8:
                    verkhovnaRada.showGrafters(factions);
                    break;
                case 9:
                    verkhovnaRada.giveBribeToAll(factions);
                    break;
                case 10:
                    faction.compareDeputy(factions);
                    break;
                case 11:
                    verkhovnaRada.compareDeputy(factions);
                    break;
                case 12:
                    info();
                    break;
                case 13:
                    System.exit(0);

            }
        }
    }

    private static void info() {
        System.out.println("Нажміть 1 для того щоб створити фракцію");
        System.out.println("Нажміть 2 для того щоб видалити фракцію ");
        System.out.println("Нажміть 3 для того щоб вивести всі фракції");
        System.out.println("Нажміть 4 для того щоб вилучити всіх депутатів з фракції");
        System.out.println("Нажміть 5 для того щоб вивести фракцію");
        System.out.println("Нажміть 6 для того щоб додати депутата до фракції");
        System.out.println("Нажміть 7 для того щоб вилучити депутата з фракції");
        System.out.println("Нажміть 8 для того щоб вивести на екран хабарників");
        System.out.println("Нажміть 9 для того щоб дати хабара всім");
        System.out.println("Нажміть 10 для того щоб вивести головно хабарника");
        System.out.println("Нажміть 11 для того щоб побачачити головних хабарників в кожній фракції");
        System.out.println("Нажміть 12 для того щоб побачачити info");
        System.out.println("Нажміть 13 щоб завершити роботу");

    }

}
