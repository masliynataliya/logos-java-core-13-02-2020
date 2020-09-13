package homework.markoTolochko.lesson5Coin;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            int number;
            System.out.println();
            System.out.println("eagle press 1");
            System.out.println("tail press 2");
            System.out.println();
            Random random = new Random();
            Scanner scan = new Scanner(System.in);
            int userChoice = scan.nextInt();
            int randomNumber = random.nextInt(3);
            switch (userChoice) {
                case 1:
                    System.out.println("You choose Eagle!!!");
                    break;
                case 2:
                    System.out.println("You choose Tail!!!");
                    break;
            }
            if (randomNumber == 1) {
                System.out.println("RandomCoin chose  EAGLE");
            }
            if (randomNumber == 2) {
                System.out.println("RandomCoin chose TAIL");
            }
            if (randomNumber == userChoice){
                System.out.println("You Win");
            }
            if (userChoice != randomNumber) {
                System.out.println("You Looooosssseee");
            }
        }
    }
}