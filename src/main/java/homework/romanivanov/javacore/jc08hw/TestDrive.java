package homework.romanivanov.javacore.jc08hw;

import java.util.Scanner;

public class TestDrive {
    public static void main(String[] args) {
        boolean go = true;
        Month[] month = Month.values();
        info();
        while (go) {
            System.out.println("Введіть опцію, що ви хочете зробити");
            Scanner sc = new Scanner(System.in);
            String choose = sc.nextLine();



            switch (choose) {
                case "1":
                    System.out.println("Введіть місяць");
                    boolean b = true;
                    String name = sc.nextLine().toUpperCase();
                    Month month1 = Month.valueOf(name);
                    for (Month c : month) {
                        if (month1.equals(c)) {
                            System.out.println(name + " Існує");
                            b = false;
                        }
                    }
                    if (b) {
                        System.out.println("Такого місяця не існує");
                    }
                    break;

                case "2":
                    System.out.println("Введіть пору року");
                    String season1 = sc.nextLine().toUpperCase();
                    Seasons seasons = Seasons.valueOf(season1);
                    int count = 0;
                    for (Month c : month) {
                        if (seasons.equals(c.getSeasons())) {
                            System.out.println(c.name());
                            count++;

                        }

                    }
                    if (count == 0) {
                        System.out.println("Ганьба");
                    }
                    break;

                case "3":
                    System.out.println("Введіть кількість днів");
                    int days = Integer.parseInt(sc.nextLine());
                    if (checkValidDays(days)) {
                        for (Month c : month) {
                            if (c.getDays() == days) {
                                System.out.println(c);
                            }
                        }
                    } else System.out.println("Немає місяців з такою кількістю днів");
                    break;
                case "4":
                    System.out.println("Введіть кількість днів ");
                    int daysLess = Integer.parseInt(sc.nextLine());
                    if (daysLess > 28) {
                        for (Month c : month) {
                            if (c.getDays() < daysLess) {
                                System.out.println(c);
                            }
                        }
                    } else System.out.println("Немає таких місяців ");
                    break;

                case "5":
                    System.out.println("Введіть кількість днів ");
                    int daysMore = Integer.parseInt(sc.nextLine());
                    if (daysMore<32) {
                        for (Month c : month) {
                            if (c.getDays() > daysMore) {
                                System.out.println(c);
                            }

                        }

                    } else System.out.println("Немає таких місяців ");
                    break;
                case "6":
                    System.out.println("Введіть пору року");
                    String season2 = sc.nextLine().toUpperCase();
                    if (Seasons.AUTUMN.name().equals(season2)) {
                        System.out.println(Seasons.WINTER.name());
                    } else if (Seasons.SPRING.name().equals(season2)) {
                        System.out.println(Seasons.SUMMER.name());
                    } else if (Seasons.SUMMER.name().equals(season2)) {
                        System.out.println(Seasons.AUTUMN.name());
                    } else if (Seasons.WINTER.name().equals(season2)) {
                        System.out.println(Seasons.SPRING.name());
                    } else {
                        System.out.println("Немає такої пори");
                    }
                    break;


                case"7":
                    System.out.println("Введіть пору року");
                    String season3 = sc.nextLine().toUpperCase();
                    if (Seasons.AUTUMN.name().equals(season3)) {
                        System.out.println(Seasons.SUMMER.name());
                    } else if (Seasons.SPRING.name().equals(season3)) {
                        System.out.println(Seasons.WINTER.name());
                    } else if (Seasons.SUMMER.name().equals(season3)) {
                        System.out.println(Seasons.SPRING.name());
                    } else if (Seasons.WINTER.name().equals(season3)) {
                        System.out.println(Seasons.AUTUMN.name());
                    } else {
                        System.out.println("Немає такої пори");
                    }
                    break;
                case "8":
                        for (Month c : month) {
                            if (c.getDays() % 2 == 0) {
                                System.out.println(c);
                            }
                        }

                    break;
                case "9":
                        for (Month c : month) {
                            if (c.getDays() % 2 == 1) {
                                System.out.println(c);
                            }
                    }
                    break;
                case"10":
                    System.out.println("Введіть місяць");
                    String monthPair = sc.nextLine().toUpperCase();
                    Month month2 = Month.valueOf(monthPair);
                    for (Month c : month) {
                        if (month2.equals(c)){
                            if(c.getDays()%2==0){
                                System.out.println(c + " Має парну кількість днів");
                            }else System.out.println(c + " Не має парну кількість днів");

                        }

                    }
                    break;
                case"11":
                    info();
                    break;
                case"12":
                    go = false;
                    break;

            }


        }


    }

    public static boolean checkValidDays(int days) {
        return days > 29 && days < 32;
    }

    public static void info(){
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
