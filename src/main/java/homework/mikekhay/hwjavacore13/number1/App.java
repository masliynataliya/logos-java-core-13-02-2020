package homework.mikekhay.hwjavacore13.number1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        VerkhovnaRada verkhovnaRada = VerkhovnaRada.getInstance();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Виберіть опцію.");
            System.out.println("Введіть 1 щоб додати фракцію.");
            System.out.println("Введіть 2 щоб видалити конкретну фракцію.");
            System.out.println("Введіть 3 щоб вивести усі  фракції.");
            System.out.println("Введіть 4 щоб очистити конкретну фракцію.");
            System.out.println("Введіть 5 щоб вивести конкретну фракцію.");
            System.out.println("Введіть 6 щоб завершити роботу.");

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
                    System.exit(0);
                    break;
                default:
                    System.out.println("Опції з таким номером не існує.");
            }
        }
    }
}
