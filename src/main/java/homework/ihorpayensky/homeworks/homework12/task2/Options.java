package homework.ihorpayensky.homeworks.homework12.task2;

import java.util.List;

abstract class Options {

    public static void getInfo() {
        System.out.println("1 - Перевірити чи є такий місяць");
        System.out.println("2 - Вивести всі місяці з такою ж порою року");
        System.out.println("3 - Вивести всі місяці які мають таку саму кількість днів");
        System.out.println("4 - Вивести на екран всі місяці які мають меншу кількість днів");
        System.out.println("5 - Вивести на екран всі місяці які мають більшу кількість днів");
        System.out.println("6 - Вивести на екран наступну пору року");
        System.out.println("7 - Вивести на екран попередню пору року");
        System.out.println("8 - Вивести на екран всі місяці які мають парну кількість днів");
        System.out.println("9 - Вивести на екран всі місяці які мають непарну кількість днів");
        System.out.println("0 - Вивести на екран чи введений з консолі місяць має парну кількість днів");
        System.out.println("11 - Закрити програму");
        System.out.println("Choice the option:");
    }

    public static void findMonth(List<Months> monthsList, String month) {
        boolean ifNotFound = true;
        for (Months e: monthsList) {
            if (e.name().equalsIgnoreCase(month)) {
                System.out.println("Month found '" + e.name() + "'");
                ifNotFound = false;
            }
        }
        if (ifNotFound)
            System.out.println("Month '" + month + "' is not found!");
    }

    public static void findAllMonthWithOneSeason(List<Months> monthsList, String month) {
        boolean ifNotFound = true;
        for (Months e: monthsList) {
            if (e.name().equalsIgnoreCase(month)) {
                System.out.println("Month found '" + e.name() + "'");
                System.out.println("Another mounts of season '" + e.getSeason() +"': ");
                ifNotFound = false;
                for (Months m: monthsList) {
                    if (e.getSeason().equals(m.getSeason())) {
                        System.out.println("\t'" + m.name() +"'");
                    }
                }
            }
        }
        if (ifNotFound)
            System.out.println("Month '" + month + "' is not found!");
    }

    public static void getMonthsTheSameCountDays(List<Months> monthsList, String month) {
        boolean ifNotFound = true;
        for (Months e: monthsList) {
            if (e.name().equalsIgnoreCase(month)) {
                System.out.println("Found month '" + e.name() + "' with " + e.getDay() + " days");
                ifNotFound = false;
                System.out.println("Days:");
                for (Months m: monthsList) {
                    if (m.getDay() == e.getDay()) {
                        System.out.println("\t'" + m.name() + "' with " + m.getDay() + " days");
                    }
                }
            }
        }
        if (ifNotFound)
            System.out.println("Month '" + month + "' is not found!");
    }

    // lazy mod xD

    public static void findMonthWithSomeDays(List<Months> monthsList, boolean is31) {
        for (Months e: monthsList) {
            if (!is31 && e.getDay() < 30) {
                System.out.println("\t'" + e.name() + "' have " + e.getDay() + " days");
            }
            if (e.getDay() == (is31 ? 31 : 30)) {
                System.out.println("\t'" + e.name() + "' have " + e.getDay() + " days");
            }
        }
    }

    public static void getNextOrPreviousSeason(List<Seasons> seasonList, String season, boolean next) {
        boolean isNotFound = true;
        for (int i = 0; i < seasonList.size(); i++) {
            if (seasonList.get(i).name().equalsIgnoreCase(season)) {
                System.out.println("Season found '" + seasonList.get(i).name() + "'");
                if (next) {
                    System.out.println("The next season is '" + seasonList.get((i+1)%seasonList.size()) + "'");
                }
                else {
                    System.out.println("The previous season is '" + seasonList.get(
                            (i-1) % seasonList.size() < 0 ?
                                    (i-1) % seasonList.size() + seasonList.size() :
                                    (i-1) % seasonList.size()
                    ) + "'");
                }
                isNotFound = false;
                break;
            }
        }
        if (isNotFound)
            System.out.println("Season is not found...");
    }

    public static void findMonthsWithPairOrNotDays(List<Months> monthsList, boolean pair) {
        System.out.println("Months:");
        for (Months e: monthsList) {
            if (e.getDay() %2 == (pair ? 0 : 1)) {
                System.out.println("\t'" + e.name() + "' with " + e.getDay() + " days");
            }
        }
    }

    public static void checkMonth(List<Months> monthsList, String month) {
        boolean ifNotFound = true;
        for (Months e: monthsList) {
            if (e.name().equalsIgnoreCase(month)) {
                System.out.println("Month found '" + e.name() + "'");
                System.out.println(
                        e.getDay() %2 == 0 ?
                                "Has pair count days... (" + e.getDay() + " days)" :
                                "Has not pair count days...(" + e.getDay() + " days)"
                );
                ifNotFound = false;
                break;
            }
        }
        if (ifNotFound)
            System.out.println("Month '" + month + "' is not found!");
    }
}
