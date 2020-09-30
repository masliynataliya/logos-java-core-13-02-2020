package homework.denysyerchenko.lesson15.zooclub;

import java.util.*;

public class ZooClubApp {
    public static void main(String[] args) {

        while (true) {

            System.out.println("Welcome to ZooClub app");
            System.out.println("Press 1 to add a new member");
            System.out.println("Press 2 to add an animal to a member");
            System.out.println("Press 3 to remove an animal from a member");
            System.out.println("Press 4 to remove a member");
            System.out.println("Press 5 to remove a certain animal from all members");
            System.out.println("Press 6 to show all members");
            System.out.println("Press 7 close ZooClub app");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    Person member = new Person();
                    ZooClub newZooClub = new ZooClub();
                    System.out.println("Enter member's name");
                    member.setPersonName(scanner.next());
                    System.out.println("Enter member's age");
                    member.setPersonAge(scanner.nextInt());
                    Animal membersAnimal = new Animal();
                    List<Animal> animalsList = new ArrayList<>();
                    System.out.println("Enter animal's type");
                    membersAnimal.setAnimalType(scanner.next());
                    System.out.println("Enter animal's name");
                    membersAnimal.setAnimalName(scanner.next());
                    animalsList.add(membersAnimal);
                    newZooClub.map.put(member, animalsList);
                    System.out.println("The member has been added successfully");
                    break;
                case 2:
                    System.out.println("Enter member's name");
                    Scanner scanner2 = new Scanner(System.in);
                    String desiredMember = scanner2.next();
                    for (Map.Entry<Person, List <Animal>> entry : ZooClub.getMap().entrySet()) {
                        Person currentMember = entry.getKey();
                        List currentMemberAnimalsList = entry.getValue();
                        if (currentMember.getPersonName().equalsIgnoreCase(desiredMember)) {
                            Animal newAnimal = new Animal();
                            System.out.println("Enter animal's type");
                            newAnimal.setAnimalType(scanner.next());
                            System.out.println("Enter animal's name");
                            newAnimal.setAnimalName(scanner.next());
                            currentMemberAnimalsList.add(newAnimal);
                            System.out.println("The new animal has been added");
                            break;
                        }
                    }

            }
        }
    }
}
