package homework.katerynakikidzhan.JC05.second;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Coin coin = new Coin();
        Random random = new Random();
        int heads = 0;
        int tails = 0;
        int tosses = random.nextInt(15);
        for (int i = 1; i<= tosses; i++) {
            if (coin.result().equals("Tails!")) {
                tails++;
            } else {
                heads++;
            }
        }
        System.out.println("Tosses: " + tosses);
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}
