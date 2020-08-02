package homework.mikekhay.hwjavacore09.number01andnumber03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongInputConsoleParametersException {

            System.out.println ("Select an option.");
            System.out.println ("1. Check if there is such a month.");
            System.out.println ("2. Print all months with the same time of year.");
            System.out.println ("3. Print all months that have the same number of days");
            System.out.println ("4. Display all months with fewer days");
            System.out.println ("5. Display all months that have more days");
            System.out.println ("6. Display the next season");
            System.out.println ("7. Display the previous season");
            System.out.println ("8. Display all months that have an even number of days");
            System.out.println ("9. Display all months that have an odd number of days");
            System.out.println ("10. Display whether the month entered from the console has an even number of days");

            Month[] months = Month.values();
            Season[] seasons = Season.values();
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();

            switch (option) {   //Option selection unit.
                case "1":   //This month's inspection unit is available.
                    System.out.println("Enter the month.");
                    Scanner o1 = new Scanner(System.in);
                    String month1 = o1.nextLine();
                    try {
                        Month m1 = Month.valueOf(month1.toUpperCase());
                        System.out.println("So there is such a month.");
                    } catch (Exception e) {
                        System.out.println("No, there is no such month.");
                    }
                    break;

                case "2":   //The output unit of all months with this time of year.
                    System.out.println("Enter the month.");
                    Scanner o2 = new Scanner(System.in);
                    String month2 = o2.nextLine();
                    try {
                        Month m2 = Month.valueOf(month2.toUpperCase());
                        Season s = m2.getSeason();
                        for (int a = 0; a < months.length; a++) {
                            Season testS = months[a].getSeason();
                            if (s.equals(testS)) {
                                System.out.println(months[a]);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("No, there is no such month.");
                    }
                    break;

                case "3":   //Block output of all months with the same number of days.
                    System.out.println("Enter the month.");
                    Scanner o3 = new Scanner(System.in);
                    String month3 = o3.nextLine();
                    try {
                        Month m3 = Month.valueOf(month3.toUpperCase());
                        int d = m3.getDay();
                        for (int a = 0; a < months.length; a++) {
                            if (d == months[a].getDay()) {
                                System.out.println(months[a]);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("No, there is no such month.");
                    }
                    break;

                case "4":   //Output unit for all months with fewer days.
                    System.out.println("Enter the month.");
                    Scanner o4 = new Scanner(System.in);
                    String month4 = o4.nextLine();
                    try {
                        Month m4 = Month.valueOf(month4.toUpperCase());
                        int d = m4.getDay();
                        for (int a = 0; a < months.length; a++) {
                            if (d > months[a].getDay()) {
                                System.out.println(months[a]);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("No, there is no such month.");
                    }
                    break;

                case "5":   //Block output of all months with more days.
                    System.out.println("Enter the month.");
                    Scanner o5 = new Scanner(System.in);
                    String month5 = o5.nextLine();
                    try {
                        Month m5 = Month.valueOf(month5.toUpperCase());
                        int d = m5.getDay();
                        for (int a = 0; a < months.length; a++) {
                            if (d < months[a].getDay()) {
                                System.out.println(months[a]);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("No, there is no such month.");
                    }
                    break;

                case "6":   //The output unit of the next season.
                    System.out.println("Enter the season.");
                    Scanner o6 = new Scanner(System.in);
                    String season6 = o6.nextLine();
                    try {
                        int s6 = Season.valueOf(season6.toUpperCase()).ordinal() + 1;
                        System.out.println(seasons[s6]);
                    } catch (Exception e) {
                        System.out.println("There is no such time of year.");
                    }
                    break;

                case "7":   //Output unit of the previous season.
                    System.out.println("Enter the season.");
                    Scanner o7 = new Scanner(System.in);
                    String season7 = o7.nextLine();
                    try {
                        int s7 = Season.valueOf(season7.toUpperCase()).ordinal() - 1;
                        System.out.println(seasons[s7]);
                    } catch (Exception e) {
                        System.out.println("There is no such time of year.");
                    }
                    break;

                case "8":   //Output unit for all months that have an even number of days.
                    for (Month c : months) {
                        if (c.getDay() % 2 == 0) {
                            System.out.println(c);
                        }
                    }
                    break;

                case "9":   //Output unit for all months that have an odd number of days.
                    for (Month c : months) {
                        if (c.getDay() % 2 != 0) {
                            System.out.println(c);
                        }
                    }
                    break;

                case "10":  //The block of check of a certain month for parity of days.
                    System.out.println("Enter the month.");
                    Scanner o10 = new Scanner(System.in);
                    String month10 = o10.nextLine();
                    try {
                        Month m10 = Month.valueOf(month10.toUpperCase());
                        if (m10.getDay() % 2 == 0) {
                            System.out.println("Has an even number of days.");
                        } else {
                            System.out.println("Has an odd number of days.");
                        }
                    } catch (Exception e) {
                        System.out.println("No, there is no such month.");
                    }
                    break;

                default:    //Error block when selecting the wrong option
                    throw new WrongInputConsoleParametersException();
            }
        }
    }
