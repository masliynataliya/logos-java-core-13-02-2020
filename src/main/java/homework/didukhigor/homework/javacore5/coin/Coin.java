package homework.didukhigor.homework.javacore5.coin;

import java.util.Random;

public class Coin {
    public static void main(String[] args) {
        double a = Math.random();

        if (a<=0.5)
        {
            System.out.println("Випала решка");
        }
        else
        {
            System.out.println("Випав орел");

        }
    }

    }
