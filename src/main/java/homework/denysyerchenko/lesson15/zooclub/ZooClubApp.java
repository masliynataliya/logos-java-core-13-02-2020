package homework.denysyerchenko.lesson15.zooclub;

import java.util.*;

public class ZooClubApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Welcome to ZooClub app");
            System.out.println("Press 1 to add a new member");
            System.out.println("Press 2 to add an animal to a member");
            System.out.println("Press 3 to remove an animal from a member");
            System.out.println("Press 4 to remove a member");
            System.out.println("Press 5 to remove a certain animal from all members");
            System.out.println("Press 6 to show all members");
            System.out.println("Press 7 close ZooClub app");

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
                    newZooClub.getMap().put(member, animalsList);
                    System.out.println("The member has been added successfully");
                    break;
                case 2:
                    System.out.println("Enter member's name");
                    String desiredMember = scanner.next();
                    for (Map.Entry<Person, List<Animal>> entry : ZooClub.getMap().entrySet()) {
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
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter member's name");
                    String desiredMember2 = scanner.next();
                    for (Map.Entry<Person, List<Animal>> entry : ZooClub.getMap().entrySet()) {
                        Person currentMember2 = entry.getKey();
                        List currentMemberAnimalsList2 = entry.getValue();
                        if (currentMember2.getPersonName().equalsIgnoreCase(desiredMember2)) {
                            System.out.println("Enter animal's name");
                            String animalToRemove = scanner.next();
                            ListIterator<Animal> iterator = currentMemberAnimalsList2.listIterator();
                            while (iterator.hasNext()) {
                                if (iterator.next().getAnimalName().equalsIgnoreCase(animalToRemove)) {
                                    iterator.remove();
                                }
                            }
                            System.out.println("The animal has been removed");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter member's name");
                    String desiredMember3 = scanner.next();
                    for (Map.Entry<Person, List<Animal>> entry : ZooClub.getMap().entrySet()) {
                        Person currentMember3 = entry.getKey();
                        if (currentMember3.getPersonName().equalsIgnoreCase(desiredMember3)) {
                            ZooClub.getMap().remove(currentMember3);
                        }
                    }
                    System.out.println("The member has been removed");
                    break;
                case 5:
                    System.out.println("Enter animal's type");
                    String desiredAnimal = scanner.next();
                    for (Map.Entry<Person, List<Animal>> entry : ZooClub.getMap().entrySet()) {
                        List currentMemberAnimalsList3 = entry.getValue();
                        ListIterator<Animal> iterator2 = currentMemberAnimalsList3.listIterator();
                        while (iterator2.hasNext()) {
                            if (iterator2.next().getAnimalType().equalsIgnoreCase(desiredAnimal)) {
                                iterator2.remove();
                            }
                        }
                    }
                    System.out.println("The animal has been removed");
                    break;
                case 6:
                    System.out.println(ZooClub.getMap().toString());
                    break;
                case 7:
                    System.out.println("Closing ZooAClub app");
                    System.exit(1);
            }
        }
    }
}

