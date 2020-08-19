package homework.ihorpayensky.homeworks.homework12.task2;

import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Months> months = new ArrayList<>(EnumSet.allOf(Months.class));
        List<Seasons> seasons = new ArrayList<>(EnumSet.allOf(Seasons.class));

        while (true) {
            Options.getInfo();
            System.out.print(" >> ");
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    System.out.print("Enter a month >> ");
                    String m1 = scanner.nextLine();
                    Options.findMonth(months, m1);
                    System.out.println();
                    break;
                case "2":
                    System.out.print("Enter a month >> ");
                    String m2 = scanner.nextLine();
                    Options.findAllMonthWithOneSeason(months, m2);
                    System.out.println();
                    break;
                case "3":
                    System.out.print("Enter a month >>");
                    String m3 = scanner.nextLine();
                    Options.getMonthsTheSameCountDays(months, m3);
                    break;
                case "4":
                    System.out.println("Months with 30 days! (or less)");
                    Options.findMonthWithSomeDays(months, false);
                    System.out.println();
                    break;
                case "5":
                    System.out.println("Months with 31 days!");
                    Options.findMonthWithSomeDays(months, true);
                    System.out.println();
                    break;
                case "6":
                    System.out.print("Enter season >> ");
                    String s6 = scanner.nextLine();
                    Options.getNextOrPreviousSeason(seasons, s6, true);
                    System.out.println();
                    break;
                case "7":
                    System.out.print("Enter season >> ");
                    String s7 = scanner.nextLine();
                    Options.getNextOrPreviousSeason(seasons, s7, false);
                    System.out.println();
                    break;
                case "8":
                    System.out.println("All months with pair days");
                    Options.findMonthsWithPairOrNotDays(months,true);
                    System.out.println();
                    break;
                case "9":
                    System.out.println("All months with not pair days");
                    Options.findMonthsWithPairOrNotDays(months,false);
                    System.out.println();
                    break;
                case "0":
                    System.out.print("Enter mount >> ");
                    String m0 = scanner.nextLine();
                    Options.checkMonth(months, m0);
                    break;
                case "11":
                    System.out.println("Closing session...");
                    System.exit(0);
                default:
                    System.out.println("This option is not present! Try again...");
                    break;
            }



        }

    }



}
