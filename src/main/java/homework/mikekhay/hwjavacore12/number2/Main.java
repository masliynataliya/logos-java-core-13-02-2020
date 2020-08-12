package homework.mikekhay.hwjavacore12.number2;


import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean proceed = true;
        while (proceed) {
            System.out.println("Виберіть опцію.");
            System.out.println("1.Перевірити чи є такий місяць.");
            System.out.println("2.Вивести всі місяці з такою ж порою року.");
            System.out.println("3.Вивести всі місяці які мають таку саму кількість днів");
            System.out.println("4.Вивести на екран всі місяці які мають меншу кількість днів");
            System.out.println("5.Вивести на екран всі місяці які мають більшу кількість днів");
            System.out.println("6.Вивести на екран наступну пору року");
            System.out.println("7.Вивести на екран попередню пору року");
            System.out.println("8.Вивести на екран всі місяці які мають парну кількість днів");
            System.out.println("9.Вивести на екран всі місяці які мають непарну кількість днів");
            System.out.println("10.Вивести на екран чи введений з консолі місяць має парну кількість днів");

            ArrayList<Month> months = new ArrayList<Month>(EnumSet.allOf(Month.class));
            ArrayList<Season> seasons = new ArrayList<Season>(EnumSet.allOf(Season.class));
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();


            switch (option) {
                case "1":
                    System.out.println("Введіть місяць.");
                    String month1 = sc.nextLine();
                    try {
                        Month m1 = Month.valueOf(month1.toUpperCase());
                        System.out.println("Так є такий місяць");
                    } catch (Exception e) {
                        System.out.println("Ні немає такого місяця");
                    }
                    break;

                case "2":
                    System.out.println("Введіть місяць.");
                    String month2 = sc.nextLine();
                    try {
                        Month m2 = Month.valueOf(month2.toUpperCase());
                        Season s = m2.getSeason();
                        for (int a = 0; a < months.size(); a++) {
                            Season testS = months.get(a).getSeason();
                            if (s.equals(testS)) {
                                System.out.println(months.get(a));
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Ні немає такого місяця");
                    }
                    break;

                case "3":
                    System.out.println("Введіть місяць.");
                    String month3 = sc.nextLine();
                    try {
                        Month m3 = Month.valueOf(month3.toUpperCase());
                        int d = m3.getDay();
                        for (int a = 0; a < months.size(); a++) {
                            if (d == months.get(a).getDay()) {
                                System.out.println(months.get(a));
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Ні немає такого місяця");
                    }
                    break;

                case "4":
                    System.out.println("Введіть місяць.");
                    String month4 = sc.nextLine();
                    try {
                        Month m4 = Month.valueOf(month4.toUpperCase());
                        int d = m4.getDay();
                        for (int a = 0; a < months.size(); a++) {
                            if (d > months.get(a).getDay()) {
                                System.out.println(months.get(a));
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Ні немає такого місяця");
                    }
                    break;

                case "5":
                    System.out.println("Введіть мiсяць.");
                    String month5 = sc.nextLine();
                    try {
                        Month m5 = Month.valueOf(month5.toUpperCase());
                        int d = m5.getDay();
                        for (int a = 0; a < months.size(); a++) {
                            if (d < months.get(a).getDay()) {
                                System.out.println(months.get(a));
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Ні немає такого місяця");
                    }
                    break;

                case "6":
                    System.out.println("Введіть пору-року.");
                    String season6 = sc.nextLine();
                    try {
                        int s6 = Season.valueOf(season6.toUpperCase()).ordinal() + 1;
                        System.out.println(seasons.get(s6));

                    } catch (Exception e) {
                        System.out.println("Такої пори року не існує");
                    }

                    break;

                case "7":
                    System.out.println("Введіть пору-року.");
                    String season7 = sc.nextLine();
                    try {
                        int s7 = Season.valueOf(season7.toUpperCase()).ordinal() - 1;
                        System.out.println(seasons.get(s7));

                    } catch (Exception e) {
                        System.out.println("Такої пори року не існує");
                    }
                    break;

                case "8":
                    for (Month c : months) {
                        if (c.getDay() % 2 == 0) {
                            System.out.println(c);
                        }
                    }
                    break;

                case "9":
                    for (Month c : months) {
                        if (c.getDay() % 2 != 0) {
                            System.out.println(c);
                        }
                    }
                    break;

                case "10":
                    System.out.println("Введіть місяць.");
                    String month10 = sc.nextLine();
                    try {
                        Month m10 = Month.valueOf(month10.toUpperCase());
                        if (m10.getDay() % 2 == 0) {
                            System.out.println("Має парну кількість днів.");
                        } else {
                            System.out.println("Має непарну кількість днів.");
                        }
                    } catch (Exception e) {
                        System.out.println("Ні немає такого місяця");
                    }
                    break;


            }
        }
    }
}
