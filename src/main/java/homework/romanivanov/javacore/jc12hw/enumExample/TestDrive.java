/*
Copyright  Logos it academy. all rights reserved.
LOGOS IY ACADEMY PROPRIETARY/CONFIDENTIAL.
 */
package homework.romanivanov.javacore.jc12hw.enumExample;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class TestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean go = true;
        ArrayList<Month> months = new ArrayList<Month>(EnumSet.allOf(Month.class));
        ArrayList<Seasons> seasons = new ArrayList<Seasons>(EnumSet.allOf(Seasons.class));
        while (go) {
            info();
            System.out.println("Choose option");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    String setMonth = sc.nextLine().toUpperCase();
                    isMonth(months, setMonth);
                    break;
                case 2:
                    String setSeason = sc.nextLine().toUpperCase();
                    getMonthBySeason(months, setSeason);
                    break;
                case 3:
                    System.out.println("Введіть кількість днів");
                    int setDays = sc.nextInt();
                    getMonthByDays(months, setDays);
                    break;
                case 4:
                    System.out.println("Введіть кількість днів");
                    int setDays1 = sc.nextInt();
                    getMonthByLessDays(months, setDays1);
                    break;
                case 5:
                    System.out.println("Введіть кількість днів");
                    int setDays2 = sc.nextInt();
                    getMonthByMoreDays(months, setDays2);
                    break;
                case 6:
                    System.out.println("Введіть Сезон");
                    String setMonth2 = sc.nextLine().toUpperCase();
                    getNextSeason(seasons, setMonth2);
                    break;
                case 7:
                    System.out.println("Введіть Сезон");
                    String setMonth3 = sc.nextLine().toUpperCase();
                    getPreviousSeason(seasons, setMonth3);
                    break;
                case 8:
                    getMonthByPairDays(months);
                    break;
                case 9:
                    getMonthsByUnpaired(months);
                    break;
                case 10:
                    System.out.println("Введіть місяць");
                    String setMonth4 = sc.nextLine().toUpperCase();
                    checkMonthPair(months, setMonth4);
                    break;
                case 11:
                    info();
                    break;
                case 12:
                    go = false;


            }
        }

    }


    private static void checkMonthPair(ArrayList<Month> months, String setMonth) {
        for (Month c : months) {
            if (c.name().equals(setMonth)) {
                if (c.getDays() % 2 == 0) {
                    System.out.println("Парний місяць");
                } else System.out.println("Не парний місяць");
            }
        }
    }

    private static void getMonthsByUnpaired(ArrayList<Month> months) {
        for (Month c : months) {
            if (c.getDays() % 2 == 1) {
                System.out.println(c);
            }

        }
    }

    private static void getMonthByPairDays(ArrayList<Month> months) {
        for (Month c : months) {
            if (c.getDays() % 2 == 0) {
                System.out.println(c);
            }

        }
    }

    private static void getPreviousSeason(ArrayList<Seasons> seasons, String setMonth) {
        int size = seasons.size();
        int indexOf = seasons.indexOf(Seasons.valueOf(setMonth));
        int nextIndex = indexOf - 1;
        if (nextIndex <= size) {
            nextIndex = 3;
        }

        System.out.println(seasons.get(nextIndex));
    }

    private static void getNextSeason(ArrayList<Seasons> seasons, String setMonth) {
        int size = seasons.size();
        int indexOf = seasons.indexOf(Seasons.valueOf(setMonth));
        int nextIndex = indexOf + 1;
        if (nextIndex >= size) {
            nextIndex = 0;
        }

        System.out.println(seasons.get(nextIndex));
    }

    private static void getMonthByMoreDays(ArrayList<Month> months, int numberOfDays) {
        List<Month> months1 = months.stream().filter(month -> month.getDays() > numberOfDays).collect(Collectors.toList());
        System.out.println(months1.toString());
    }

    private static void getMonthByLessDays(ArrayList<Month> months, int numberOfDays) {
        List<Month> months1 = months.stream().filter(month -> month.getDays() < numberOfDays).collect(Collectors.toList());
        System.out.println(months1.toString());
    }

    private static void getMonthByDays(ArrayList<Month> months, int numberOfDays) {
        List<Month> months1 = months.stream().filter(month -> month.getDays() == numberOfDays).collect(Collectors.toList());
        System.out.println(months1.toString());
    }

    private static void getMonthBySeason(ArrayList<Month> months, String month1) {
        System.out.println("Введіть Сезон");
        AtomicBoolean yes = new AtomicBoolean(false);
        months.forEach(month -> {
            if (month.getSeasons().name().equals(month1)) {
                System.out.println(month.name());
                yes.set(true);
            }
        });
        if (!yes.get()) {
            System.out.println("Doesn`t exist");
        }
    }

    private static void isMonth(ArrayList<Month> months, String setMonth) {
        System.out.println("Введіть Місяць");
        AtomicBoolean yes = new AtomicBoolean(false);
        months.forEach(month -> {
            if (month.name().equals(setMonth)) {
                yes.set(true);
            }
        });
        if (!yes.get()) {
            System.out.println("Doesn`t exist");

        }
    }

    public static void info() {
        System.out.println("1 - Перевірка чи є такий місяць");
        System.out.println("2 - Вивести всі місяці з такою ж порою року");
        System.out.println("3 - Вивести всі місяці які мають таку саму кількість днів");
        System.out.println("4 - Вивести всі місяці які мають меншу кількість днів");
        System.out.println("5 - Вивести всі місяці які мають більшу кількість днів");
        System.out.println("6 - Вивести наступну пору року");
        System.out.println("7 - Вивести попередню пору року");
        System.out.println("8 - Вивести всі місяці які мають парну кількість днів");
        System.out.println("9 - Вивести всі місяці які мають непарну кількість днів");
        System.out.println("10 -Чи має місяць парну кількість днів");
        System.out.println("11 - Меню");
        System.out.println("12 - Завершення роботи");
    }
}
