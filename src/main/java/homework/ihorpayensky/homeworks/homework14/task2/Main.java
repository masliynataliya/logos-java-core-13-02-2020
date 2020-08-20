package homework.ihorpayensky.homeworks.homework14.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Controller controller = Controller.getController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Some start data for testing");
        controller.addCommodity(new Commodity("Name3", 1243, 124, 357));
        controller.addCommodity(new Commodity("Name6", 6232, 726, 125));
        controller.addCommodity(new Commodity("Name2", 8353, 346, 642));
        controller.addCommodity(new Commodity("Name1", 2352, 746, 364));
        controller.addCommodity(new Commodity("Name9", 7244, 363, 253));
        controller.addCommodity(new Commodity("Name5", 8634, 462, 623));
        System.out.println();

        while (true) {
            controller.getInfo();
            System.out.print("\nEnter option >> ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Creating new commodity:");
                    String name = Controller.Input.inputName(scanner);      // NAME
                    int width = Controller.Input.inputWidth(scanner);       // WIDTH
                    int weight = Controller.Input.inputWeight(scanner);     // WEIGHT
                    int height = Controller.Input.inputHeight(scanner);     // HEIGHT
                    controller.addCommodity(new Commodity(name,width,weight,height));
                    System.out.println();
                    break;
                case "2":
                    if (controller.isEmpty()) {
                        System.out.println("List is empty...");
                        break;
                    }
                    controller.showForeachIdElements();
                    System.out.println("Choose element by id:");
                    int id = Controller.Input.inputId(scanner);
                    controller.removeCommodity(id);
                    System.out.println();
                    break;
                case "3":
                    if (controller.isEmpty()) {
                        System.out.println("List is empty...");
                        break;
                    }
                    controller.showForeachIdElements();
                    int id3 = Controller.Input.inputId(scanner);
                    System.out.println("Enter new data:");
                    String name3 = Controller.Input.inputName(scanner);      // NAME
                    int width3 = Controller.Input.inputWidth(scanner);       // WIDTH
                    int weight3 = Controller.Input.inputWeight(scanner);     // WEIGHT
                    int height3 = Controller.Input.inputHeight(scanner);     // HEIGHT

                    controller.updateCommodity(id3, new Commodity(name3,width3,weight3,height3));
                    System.out.println();
                    break;
                case "4":
                    if (controller.isEmpty()) {
                        System.out.println("List is empty...");
                        break;
                    }
                    controller.sortByName();
                    System.out.println();
                    break;
                case "5":
                    if (controller.isEmpty()) {
                        System.out.println("List is empty...");
                        break;
                    }
                    controller.sortByWeight();
                    System.out.println();
                    break;
                case "6":
                    if (controller.isEmpty()) {
                        System.out.println("List is empty...");
                        break;
                    }
                    controller.sortByWidth();
                    System.out.println();
                    break;
                case "7":
                    if (controller.isEmpty()) {
                        System.out.println("List is empty...");
                        break;
                    }
                    controller.sortByHeight();
                    System.out.println();
                    break;
                case "8":
                    if (controller.isEmpty()) {
                        System.out.println("List is empty...");
                        break;
                    }
                    int id8 = Controller.Input.inputId(scanner);
                    controller.getCommodityById(id8);
                    System.out.println();
                    break;
                case "9":
                    if (controller.isEmpty()) {
                        System.out.println("List is empty...");
                        break;
                    }
                    controller.showForeachIdElements();
                    System.out.println();
                    break;
                case "11":
                    System.out.println("Close session...");
                    System.exit(0);
                default:
                    System.out.println("Enter again...");
            }
        }
    }
}
