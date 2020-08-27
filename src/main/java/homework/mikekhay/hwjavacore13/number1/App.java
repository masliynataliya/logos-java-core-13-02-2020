package homework.mikekhay.hwjavacore13.number1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        VerkhovnaRada verkhovnaRada = VerkhovnaRada.getInst();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Виберіть опцію.");
            System.out.println("Введіть 1 щоб додати фракцію.");
            System.out.println("Введіть 2 щоб видалити конкретну фракцію.");
            System.out.println("Введіть 3 щоб вивести усі  фракції.");
            System.out.println("Введіть 4 щоб очистити конкретну фракцію.");
            System.out.println("Введіть 5 щоб вивести конкретну фракцію.");
            System.out.println("Введіть 6 щоб додати депутата в фракцію.");
            System.out.println("Введіть 7 щоб видалити депутата з фракції.");
            System.out.println("Введіть 8 щоб вивести список хабарників.");
            System.out.println("Введіть 9 щоб вивести найбільшого хабарника.");
            System.out.println("Введіть 10 щоб завершити роботу з програмою.");


            int option = scanner.nextInt();
            switch (option){
                case 1:
                    verkhovnaRada.newFaction();
                    break;
                case 2:
                    verkhovnaRada.delFaction();
                    break;
                case 3:
                    verkhovnaRada.printFactions();
                    break;
                case 4:
                    verkhovnaRada.clearFaction();
                    break;
                case 5:
                    verkhovnaRada.printFaction();
                    break;
                case 6:
                    verkhovnaRada.newDeputyinFaction();
                    break;
                case 7:
                    verkhovnaRada.delDeputyInFaction();
                    break;
                case 8:
                    verkhovnaRada.printBribeTaker();
                    break;
                case 9:
                    verkhovnaRada.largestBribeTakerOfFaction();
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Опції з таким номером не існує.");
            }
        }
    }
}
