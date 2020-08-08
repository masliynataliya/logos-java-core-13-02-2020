package homework.markoTolochko.phoneBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
        public static void main(String[] args) {
            List<Person> phoneBook = new ArrayList<>();

            while (true) {
                System.out.println("check the phoneBook - press 1 ");
                System.out.println("add the number press - 2 ");
                System.out.println("delete by name pres - 3 ");
                System.out.println("delete by number press - 4");
                System.out.println("exit - pres 5");

                Scanner scan = new Scanner(System.in);
                int userChoice = scan.nextInt();

                switch (userChoice) {
                    case 1:
                        System.out.println(phoneBook);
                        break;
                    case 2:
                        System.out.println("enter the number which you wanna add");
                        Integer number = scan.nextInt();
                        System.out.println(" enter name ");
                        String name = scan.next();
                        Person person = new Person(number, name);
                        phoneBook.add(person);
                        break;
                    case 3:
                        System.out.println("enter name which you want delete ");
                        String nameToDelete = scan.next();
                        Iterator <Person> iteratorNameDelete = phoneBook.iterator();
                        while (iteratorNameDelete.hasNext()){
                            Person personDeleteName = iteratorNameDelete.next();
                            if (personDeleteName.getName().equals(nameToDelete)){
                                iteratorNameDelete.remove();
                            }
                        }
                        break;
                    case 4:
                        System.out.println("enter phone number which you want delete ");
                        int numberToDelete = scan.nextInt();
                        Iterator<Person> iteratorNumberDelete = phoneBook.iterator();
                        while (iteratorNumberDelete.hasNext()){
                            Person personNumberDelete = iteratorNumberDelete.next();
                            if (personNumberDelete.getPhoneNumber() == numberToDelete){
                                iteratorNumberDelete.remove();
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Bye!");
                        System.exit(0);
                    default:
                        System.out.println("Ooooops....something went wrong");
                }
            }
        }
    }