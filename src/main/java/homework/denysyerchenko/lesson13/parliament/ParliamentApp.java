package homework.denysyerchenko.lesson13.parliament;

import java.util.Scanner;

public class ParliamentApp {
    public static void main(String[] args) {

        Parliament parliament = Parliament.getInstance();

        while (true) {
            System.out.println("Welcome to Parliament app");
            System.out.println("Press 1 to add a new fraction");
            System.out.println("Press 2 to remove the certain fraction");
            System.out.println("Press 3 to show all fractions");
            System.out.println("Press 4 do remove all deputies from the certain fraction");
            System.out.println("Press 5 to show the certain fraction");
            System.out.println("Press 6 to add a deputy to the certain fraction ");
            System.out.println("Press 7 to exit the app");

            Scanner scanner = new Scanner(System.in);
            int desOption = scanner.nextInt();

            switch (desOption) {
                case 1:
                    parliament.addFraction();
                    System.out.println("The fraction is saved");
                    break;
                case 2:
                    parliament.removeFraction();
                    System.out.println("The fraction is removed");
                    break;
                case 3:
                    parliament.showAllFractions();
                    break;
                case 4:
                    System.out.println("Enter fraction's name");
                    String fractionName = scanner.next();
                    for (int i = 0; i < parliament.getFractionArrayList().size(); i++) {
                        Fraction currentFraction = parliament.getFractionArrayList().get(i);
                        if (fractionName.equalsIgnoreCase(currentFraction.getFractionName())) {
                            currentFraction.removeAllDeputies();
                        }
                    }
                    System.out.println("All deputies were deleted from the fraction");
                    break;
                case 5:
                    parliament.showCertainFraction();
                    break;
                case 6:
                    parliament.addDeputyToCertainFraction();
                    System.out.println("The deputy has been added");
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}
