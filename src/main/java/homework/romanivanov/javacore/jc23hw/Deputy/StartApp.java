package homework.romanivanov.javacore.jc23hw.Deputy;

import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VerkhovnaRada verkhovnaRada = VerkhovnaRada.getInstance();
        while (true) {
            info();
            System.out.println("Choose option");
            int choose = sc.nextInt();
            switch (choose) {

                case 1:
                    verkhovnaRada.addFaction();

                    break;
                case 2:

                    verkhovnaRada.deleteFaction();
                    break;

                case 3:
                    verkhovnaRada.allFactions();
                    break;
                case 4:
                    verkhovnaRada.removeAllDeputiesFromFaction();
                    break;
                case 5:
                    verkhovnaRada.showFaction();

                    break;
                case 6:
                    verkhovnaRada.addDeputyToFaction();

                    break;
                case 7:
                    verkhovnaRada.removeDeputyByName();
                    break;
                case 8:
                    verkhovnaRada.showGrafters();
                    break;
                case 9:
                    verkhovnaRada.giveBribeToAll();
                    break;
                case 10:
                    verkhovnaRada.deputyWithMostBribeFactions();
                    break;
                case 11:
                    info();
                    break;
                case 12:
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
        System.out.println("Нажміть 11 для того щоб побачачити info");
        System.out.println("Нажміть 12 щоб завершити роботу");

    }

}
