package homework.romanivanov.javacore.jc15hw;

import java.util.Scanner;

public class ZooClubApp {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Виберіть опцію");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    zooClub.addPerson();
                    break;
                case 2:
                    zooClub.addAnimals();
                    break;
                case 3:
                    zooClub.removeAnimalFromList();
                    break;
                case 4:
                    zooClub.removePerson();
                    break;
                case 5:
                    zooClub.removeSpecificAnimalFromAll();
                    break;
                case 6:
                    zooClub.showZooClub();
                    break;
                case 7:
                    info();
                    break;
                case 8:
                    System.exit(0);

            }
        }



    }
    public static void info() {
        System.out.println("Натисніть 1 щоб добавити людину");
        System.out.println("Натисніть 2 щоб добавити тваринку до учасника");
        System.out.println("Натисніть 3 щоб видалити тваринку за іменем");
        System.out.println("Натисніть 4 щоб видалити учасника зооклубу");
        System.out.println("Натисніть 5 щоб видалити певний тип тваринок");
        System.out.println("Натисніть 6 щоб подивитись повний список зооклубу");
        System.out.println("Натисніть 7 щоб переглянути опції");
        System.out.println("Натисніть 8 завершити роботу");

}

}


