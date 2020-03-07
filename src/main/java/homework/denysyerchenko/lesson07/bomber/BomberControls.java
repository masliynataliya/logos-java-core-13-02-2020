package homework.denysyerchenko.lesson07.bomber;

import java.util.Random;

public class BomberControls {

    private int minDistance = 1;
    private int maxDistance = 1000;

    public int getRandomIntegerBetweenRange1(int minDistance, int maxDistance) {
        Random d = new Random();
        return d.nextInt((maxDistance - minDistance) + 1) + minDistance;
    }

    public String moveUp() {
        return ("The bomber is moving up for " + getRandomIntegerBetweenRange1(minDistance, maxDistance) + " km");
    }
    public String moveDown() {
        return ("The bomber is moving down for " + getRandomIntegerBetweenRange1(minDistance, maxDistance) + " km");
    }
    public String moveRight() {
        return ("The bomber is moving right for " + getRandomIntegerBetweenRange1(minDistance, maxDistance) + " km");
    }
    public String moveLeft() {
        return ("The bomber is moving left for " + getRandomIntegerBetweenRange1(minDistance, maxDistance) + " km");
    }
}
