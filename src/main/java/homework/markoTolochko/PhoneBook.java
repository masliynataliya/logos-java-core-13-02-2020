package homework.markoTolochko;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
        public static void main(String[] args) {

            List<Integer> listPhoneNumbers = new ArrayList<>();
            List<String> listNames = new ArrayList<>();

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
                        System.out.println(listPhoneNumbers);
                        break;
                    case 2:
                        System.out.println("enter the number< which you wanna add");
                        listPhoneNumbers.add(scan.nextInt());
                        break;
                    case 3:
                        System.out.println("enter name which you want delete ");
                        listNames.remove(scan.nextLine());
                        break;
                    case 4:
                        System.out.println("enter phone number wich you want delete ");
                        listPhoneNumbers.remove(scan.nextInt());
                        break;
                    case 5:
                        System.out.println("Bye!");
                        break;
                    default:
                        System.out.println("Ooooops....something went wrong");
                }
            }
        }
    }
