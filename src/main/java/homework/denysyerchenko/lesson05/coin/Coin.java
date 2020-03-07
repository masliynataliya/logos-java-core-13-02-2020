package homework.denysyerchenko.lesson05.coin;

import java.util.Random;

public class Coin {

    private int min = 0;
    private int max = 1;

    public Coin() {

    }

    public int getRandomIntegerBetweenRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public String flipACoin() {
        if (getRandomIntegerBetweenRange(min, max) == 0) {
            return ("Is is tails");
        } else {
            return ("Is is heads");

        }
    }
}
