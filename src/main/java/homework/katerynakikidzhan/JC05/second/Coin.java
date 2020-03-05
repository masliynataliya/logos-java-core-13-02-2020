package homework.katerynakikidzhan.JC05.second;

import java.util.Random;

// Напишіть програму, яка моделюватиме кидок монети.
public class Coin {
    public static void tossTheCoin() {
        System.out.println("You tossed a coin.");
    };

    public static String result() {
        Random random = new Random();
        if (random.nextInt(100) % 2 == 0) {
            return "Heads!";
        } else {
            return "Tails!";
        }

    }
}
