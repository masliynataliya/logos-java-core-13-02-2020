package homework.denysyerchenko.lesson08.numbers.months;

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
            case 2:
                System.out.println("Enter desired month");
                String desiredMonth2 = monthScanner.nextLine();
                Month month2 = Month.valueOf(desiredMonth2.toUpperCase());
                Season s = month2.getSeason();
                for (int counter2 = 0; counter2 < months.length; counter2++) {
                    if (s.equals(months[counter2].getSeason())) {
                        System.out.println(months[counter2]);
                    }
                }
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
            case 6:
                System.out.println("Enter desired month");
                String desiredMonth6 = monthScanner.nextLine();
                Month month6 = Month.valueOf(desiredMonth6.toUpperCase());
                Season ns = month6.getSeason();
                for (int counter6 = 0; counter6 < months.length; counter6++) {
                    if (ns.equals(months[counter6].getSeason())) {
                        if (months[counter6].getSeason().equals(Season.WINTER)) {
                            System.out.println(Season.SPRING);
                            break;
                        }
                        if (months[counter6].getSeason().equals(Season.SPRING)) {
                            System.out.println(Season.SUMMER);
                            break;
                        }
                        if (months[counter6].getSeason().equals(Season.SUMMER)) {
                            System.out.println(Season.FALL);
                            break;
                        }
                        if (months[counter6].getSeason().equals(Season.FALL)) {
                            System.out.println(Season.WINTER);
                            break;
                        }
                    }
                }
            case 7:
                System.out.println("Enter desired month");
                String desiredMonth7 = monthScanner.nextLine();
                Month month7 = Month.valueOf(desiredMonth7.toUpperCase());
                Season ps = month7.getSeason();
                for (int counter7 = 0; counter7 < months.length; counter7++) {
                    if (ps.equals(months[counter7].getSeason())) {
                        if (months[counter7].getSeason().equals(Season.WINTER)) {
                            System.out.println(Season.FALL);
                            break;
                        }
                        if (months[counter7].getSeason().equals(Season.SPRING)) {
                            System.out.println(Season.WINTER);
                            break;
                        }
                        if (months[counter7].getSeason().equals(Season.SUMMER)) {
                            System.out.println(Season.SPRING);
                            break;
                        }
                        if (months[counter7].getSeason().equals(Season.FALL)) {
                            System.out.println(Season.SUMMER);
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