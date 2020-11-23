package homework.ihorpayensky.homeworks.homework15;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        ZooClub zooClub = ZooClub.getZooClubInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            zooClub.showInfo();
            System.out.print("\nEnter option >> ");
            String option = scanner.next();

            switch (option) {
                case "1":
                    System.out.print("Enter name >> ");
                    String name = scanner.next();
                    System.out.print("Enter age >> ");
                    String age = scanner.next();
                    zooClub.addPerson(new Person(name, Integer.parseInt(age)));
                    System.out.println();
                    break;
                case "2":
                    System.out.println("Choose person by id:");
                    zooClub.showForEachPersons();

                    try {
                        System.out.print("Enter person id >> ");
                        int pId = scanner.nextInt();

                        System.out.print("Enter pet type >> ");
                        String petType2 = scanner.next();

                        System.out.print("Enter pet name >> ");
                        String name2 = scanner.next();

                        zooClub.addPetToPerson(pId, new Pet(petType2, name2));

                        System.out.println();
                        break;
                    } catch (Exception e) {
                        System.out.println("Input error...\n");
                        break;
                    }
                case "3":
                    try {
                        System.out.println("Choose person by id:");
                        zooClub.showForEachPersons();

                        System.out.print("Enter person id >> ");
                        String pId = scanner.next();

                        System.out.println("Choose pet by id:");
                        zooClub.showForeachPersonPets(Integer.parseInt(pId));

                        System.out.print("Enter pet id >> ");
                        String petId = scanner.next();

                        zooClub.removePetFromPerson(Integer.parseInt(pId),Integer.parseInt(petId));

                        System.out.println();
                        break;
                    } catch (Exception e) {
                        System.out.println("Input error...");
                        break;
                    }
                case "4":
                    try {
                        System.out.println("Choose person by id:");
                        zooClub.showForEachPersons();

                        System.out.print("Enter person id >> ");
                        String pId = scanner.next();

                        zooClub.removePerson(Integer.parseInt(pId));

                        System.out.println();
                        break;
                    } catch (Exception e) {
                        System.out.println("Input error...");
                        break;
                    }
                case "5":
                    try {
                        System.out.println("Choose pet");

                        zooClub.showAllPets();

                        System.out.print("Enter person id >> ");
                        String pId = scanner.next();

                        zooClub.removePetFromAllOwners(Integer.parseInt(pId));

                        System.out.println();
                        break;
                    } catch (Exception e) {
                        System.out.println("Input error...");
                        break;
                    }
                case "6":
                    zooClub.showZooClub();
                    System.out.println();
                    break;
                case "7":
                    System.out.println("Close session...");
                    System.exit(0);
                default:
                    System.out.println("Enter again...");



            }
        }
    }
}
