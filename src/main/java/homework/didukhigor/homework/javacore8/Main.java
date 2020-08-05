package homework.didukhigor.homework.javacore8;

import java.util.Scanner;

// Створити консольне меню, в якому реалізувати
//наступні пункти :Перевірити чи є такий місяць (місяць вводимо з консолі, передбачити,
// щоб регістр букв був неважливим )
//Вивести всі місяці з такою ж порою року
//Вивести всі місяці які мають таку саму кількість днів
//Вивести на екран всі місяці які мають меншу кількість днів
//Вивести на екран всі місяці які мають більшу кількість днів
//Вивести на екран наступну пору року
//Вивести на екран попередню пору року
//Вивести на екран всі місяці які мають парну кількість днів
//Вивести на екран всі місяці які мають непарну кількість днів
//Вивести на екран чи введений з консолі місяць має парну кількість днів
public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the month.");
        Scanner scan = new Scanner(System.in);
        String months = scan.nextLine().toUpperCase();
        scan.close();


        for (Months m : Months.values()) {
            //String s = String.valueOf(m.getS());

            if (months.equals(Months.values()))
                System.out.println(months + "  is correct input");

            else
                        System.out.println("Incorrect input");
            break;
                }
            }
            }
                //switch (month) {
                   // case "season":
                       // for (Months m2 : Months.values()) {

                           // if (m2.getS().equals(Months.valueOf(month).getS()))
                               // System.out.println(m2);
                       // }
                        //break;



    //}

