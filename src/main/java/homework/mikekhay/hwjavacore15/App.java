package homework.mikekhay.hwjavacore15;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ZooClab zooClab = new ZooClab();

        while (true) {

            System.out.println();
            System.out.println("Виберыть опцію.");
            System.out.println("1.Додати учасника клубу.");
            System.out.println("2.Додати тваринку до учасника клубу.");
            System.out.println("3.Видалити тваринку з учасника клубу.");
            System.out.println("4.Видалити учасника клубу.");
            System.out.println("5.Видалити конкретну тваринку зі всіх власників.");
            System.out.println("6.Вивести на екран зооклуб.");
            System.out.println("7.Вийти з програми.");

            String option = sc.nextLine();

            switch (option) {
                case "1":
                    zooClab.addPerson();
                    break;

                case "2":
                    zooClab.addAnimal();
                    break;

                case "3":
                    zooClab.delAnimalwithPerson();
                    break;

                case "4":
                    zooClab.delPerson();
                    break;

                case "5":
                    zooClab.delAnimal();
                    break;

                case "6":
                    zooClab.printZooClab();
                    break;

                case "7":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Пункт вибратий не правильно.");

            }
        }
    }
}
