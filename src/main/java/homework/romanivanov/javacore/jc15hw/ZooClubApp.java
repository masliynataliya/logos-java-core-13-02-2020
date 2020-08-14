package homework.romanivanov.javacore.jc15hw;

import java.util.Scanner;

public class ZooClubApp {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();
        Scanner sc = new Scanner(System.in);
//        Map<Person, List<Animal>> map = new HashMap<>();
//        map.put(new Person(), new ArrayList<Animal>());
        boolean go = true;
        while (go) {
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

                    break;
                case 8:
                    System.exit(0);

            }
        }
    }

}

