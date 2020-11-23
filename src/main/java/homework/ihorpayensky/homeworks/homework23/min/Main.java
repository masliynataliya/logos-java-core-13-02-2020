package homework.ihorpayensky.homeworks.homework23.min;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {

    private static final File FILE =
            new File("src\\main\\java\\homework\\ihorpayensky\\homeworks\\homework23\\min\\database.txt");

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        RADA rada = RADA.getInstance();
        System.out.println("Вас вітає рада...");
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("1 - додати фракцію");
            System.out.println("2 - видалити конкретну фракцію");
            System.out.println("3 - вивести усі фракції");
            System.out.println("4 - очистити конкретну фракцію");
            System.out.println("5 - вивести конкретну фракцію");
            System.out.println("6 - додати депутата у фракцію");
            System.out.println("7 - видалити депутата із фракції");
            System.out.println("8 - вивести список хабарників");
            System.out.println("9 - вивести найбільшого хабарника");
            System.out.println("11 - вийти\n");

            System.out.print(" >> ");
            String option = scanner.next();
            switch (option) {
                case "1":
                    rada.addFraction(scanner);
                    break;
                case "2":
                    rada.removeFraction(scanner);
                    break;
                case "3":
                    rada.getAllFractions();
                    break;
                case "4":
                    rada.clearFractionFromDeputy(scanner);
                    break;
                case "6":
                    rada.addDeputyToFraction(scanner);
                    break;
                case "7":
                    rada.removeDeputy(scanner);
                    break;
                case "8":
                    rada.showBribers();
                    break;
                case "9":

                    break;





                case "11":
                    System.out.println("Вихід\n");
                    System.exit(0);
                default:
                    System.out.println("Введено не правильно! Попробуйте ще раз");
            }
        }
    }
}
