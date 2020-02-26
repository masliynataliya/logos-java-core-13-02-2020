package homework.romanivanov;

import java.util.Scanner;

public class Homework3 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter day of week(monday - sunday), then time of a day (morning/evening");
            String phrase1 = sc.nextLine();
            phrase1= phrase1.toLowerCase();
            String phrase2 = sc.nextLine();
            phrase2= phrase2.toLowerCase();
            switch (phrase1 + phrase2) {
                // Я захотів ускладнити собі завдання і зробити так, щоб треба було вводити самому день і час доби.

                case ("monday" + "morning" ):
                    System.out.println("before you get out house dont forget to feed the cat");
                    break;
                case ("monday" + "evening" ):
                    System.out.println("get to bed at 12:00 pm, because tomorrow you have a things to do");
                    break;
                case("tuesday" + "morning"):
                    System.out.println("get up early and do the homework to the courses");
                    break;
                case("tuesday" + "evening"):
                    System.out.println("dont be late at courses");
                    break;
                case("wednesday" + "morning"):
                    System.out.println("buy a present to a friend birthday");
                    break;
                case("wednesday" + "evening"):
                    System.out.println("practice at playing a guitar");
                    break;
                case("thursday" + "morning"):
                    System.out.println("do the homework");
                    break;
                case("thursday" + "evening"):
                    System.out.println("meet up the friend before courses");
                    break;
                case("friday" + "morning"):
                    System.out.println("call the friends and go to the bar");
                    break;
                case("friday"+ "evening"):
                    System.out.println("get wasted");
                    break;
                case("saturday" + "morning"):
                    System.out.println("drink a lot of water and take something against headache");
                    break;
                case("saturday" + "evening"):
                    System.out.println("get to bed early");
                    break;
                case("sunday" + "morning"):
                    System.out.println("buy and cook some food");
                    break;
                case("sunday" + "evening"):
                    System.out.println(" practice at playing a guitar ");
                    break;
                default:
                    System.out.println("please, check did you write the word right");


            }
        }
    }
