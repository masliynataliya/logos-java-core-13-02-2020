package homework.denysyerchenko.lesson08.months;

import java.util.Scanner;

public class MonthApp {
    public static void main(String[] args) {
        System.out.println("Select your option:");
        System.out.println("Press 1 to check if the month exists");
        System.out.println("Press 2 to show the months with the same season");
        System.out.println("Press 3 to show the months with the same number of days");
        System.out.println("Press 4 to show the month with greater number of days");
        System.out.println("Press 5 to show the month with lesser number of days");
        System.out.println("Press 6 to show tne next season");
        System.out.println("Press 7 to show the previous season");
        System.out.println("Press 8 to show all the months with even number of days");
        System.out.println("Press 9 to show all the months with odd number of days");
        System.out.println("Press 10 to check if the month has even or odd number of days");

        Month[] months = Month.values();
        Scanner optionScanner = new Scanner(System.in);
        int option = optionScanner.nextInt();
        Scanner monthScanner = new Scanner(System.in);

        switch (option) {
            case 1:
                System.out.println("Enter desired month");
                String desiredMonth1 = monthScanner.nextLine();
                for (int counter1 = 0; counter1 < months.length; counter1++) {
                    if (desiredMonth1.equalsIgnoreCase(months[counter1].toString())) {
                        System.out.println("The month exists");
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("Enter desired month");
                String desiredMonth2 = monthScanner.nextLine();
                Month month2 = Month.valueOf(desiredMonth2.toUpperCase());
                Seasons s = month2.getSeasons();
                for (int counter2 = 0; counter2 < months.length; counter2++) {
                    if (s.equals(months[counter2].getSeasons())) {
                        System.out.println(months[counter2]);
                    }
                }
                break;
            case 3:
                System.out.println("Enter desired month");
                String desiredMonth3 = monthScanner.nextLine();
                Month month3 = Month.valueOf(desiredMonth3.toUpperCase());
                int nod = month3.getNumberOfDays();
                for (int counter3 = 0; counter3 < months.length; counter3++) {
                    if (nod == months[counter3].getNumberOfDays()) {
                        System.out.println(months[counter3]);

                    }
                }
                break;
            case 4:
                System.out.println("Enter desired month");
                String desiredMonth4 = monthScanner.nextLine();
                Month month4 = Month.valueOf(desiredMonth4.toUpperCase());
                int gnod = month4.getNumberOfDays();
                for (int counter4 = 0; counter4 < months.length; counter4++) {
                    if (gnod < months[counter4].getNumberOfDays()) {
                        System.out.println(months[counter4]);
                    }
                }
                break;
            case 5:
                System.out.println("Enter desired month");
                String desiredMonth5 = monthScanner.nextLine();
                Month month5 = Month.valueOf(desiredMonth5.toUpperCase());
                int lnod = month5.getNumberOfDays();
                for (int counter5 = 0; counter5 < months.length; counter5++) {
                    if (lnod > months[counter5].getNumberOfDays()) {
                        System.out.println(months[counter5]);
                    }
                }
                break;
            case 6:
                System.out.println("Enter desired month");
                String desiredMonth6 = monthScanner.nextLine();
                Month month6 = Month.valueOf(desiredMonth6.toUpperCase());
                Seasons ns = month6.getSeasons();
                for (int counter6 = 0; counter6 < months.length; counter6++) {
                    if (ns.equals(months[counter6].getSeasons())) {
                        if (months[counter6].getSeasons().equals(Seasons.WINTER)) {
                            System.out.println(Seasons.SPRING);
                            break;
                        }
                        if (months[counter6].getSeasons().equals(Seasons.SPRING)) {
                            System.out.println(Seasons.SUMMER);
                            break;
                        }
                        if (months[counter6].getSeasons().equals(Seasons.SUMMER)) {
                            System.out.println(Seasons.FALL);
                            break;
                        }
                        if (months[counter6].getSeasons().equals(Seasons.FALL)) {
                            System.out.println(Seasons.WINTER);
                            break;
                        }
                    }
                }
            case 7:
                System.out.println("Enter desired month");
                String desiredMonth7 = monthScanner.nextLine();
                Month month7 = Month.valueOf(desiredMonth7.toUpperCase());
                Seasons ps = month7.getSeasons();
                for (int counter7 = 0; counter7 < months.length; counter7++) {
                    if (ps.equals(months[counter7].getSeasons())) {
                        if (months[counter7].getSeasons().equals(Seasons.WINTER)) {
                            System.out.println(Seasons.FALL);
                            break;
                        }
                        if (months[counter7].getSeasons().equals(Seasons.SPRING)) {
                            System.out.println(Seasons.WINTER);
                            break;
                        }
                        if (months[counter7].getSeasons().equals(Seasons.SUMMER)) {
                            System.out.println(Seasons.SPRING);
                            break;
                        }
                        if (months[counter7].getSeasons().equals(Seasons.FALL)) {
                            System.out.println(Seasons.SUMMER);
                            break;
                        }
                    }
                }
            case 8:
                for (int counter8 = 0; counter8 < months.length; counter8++) {
                    if (months[counter8].getNumberOfDays() % 2 == 0) {
                        System.out.println(months[counter8]);
                    }
                }
                break;
            case 9:
                for (int counter9 = 0; counter9 < months.length; counter9++) {
                    if (months[counter9].getNumberOfDays() % 2 != 0) {
                        System.out.println(months[counter9]);
                    }
                }
                break;
            case 10:
                System.out.println("Enter desired month");
                String desiredMonth8 = monthScanner.nextLine();
                Month month8 = Month.valueOf(desiredMonth8.toUpperCase());
                if (month8.getNumberOfDays() % 2 == 0) {
                    System.out.println("The month has even number of days");
                }
                if (month8.getNumberOfDays() % 2 != 0) {
                    System.out.println("The month has odd number of days");
                }
        }
    }
}