package homework.denysyerchenko.lesson07.bomber;

import java.util.Random;

public class B2Spirit extends Bomber implements Extras {

    double maxSpeed;
    String color;
    int speed = 1200;
    double minIncrease = 1.5;
    double maxIncrease = 2.5;
    int minInvisibilityDistance = 1;
    int maxInvisibilityDistance = 5000;
    int minBombsQuantity = 1;
    int maxBombsQuantity = 10;
    private BomberControls controls = new BomberControls();

    B2Spirit(int length, int width, int weight, double maxSpeed, String color) {
        super(length, width, weight);
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public double getRandomIntegerBetweenRange4(double minIncrease, double maxIncrease) {
        double i = new Random().nextDouble();
        double increase = minIncrease + (i *(maxIncrease - minIncrease));
        return increase;
    }
    public int getRandomIntegerBetweenRange5(int minInvisibilityDistance, int maxInvisibilityDistance) {
        Random id = new Random();
        return id.nextInt((maxInvisibilityDistance - minInvisibilityDistance) + 1) + minInvisibilityDistance;
    }
    public int getRandomIntegerBetweenRange6(int minBombsQuantity, int maxBombsQuantity) {
        Random bq = new Random();
        return bq.nextInt((maxBombsQuantity - minBombsQuantity) + 1) + minBombsQuantity;
    }
    @Override
    public String turboBoost() {
        return ("The speed increased to " + (int)(speed * getRandomIntegerBetweenRange4(minIncrease, maxIncrease)) + " km/h");
    }
    @Override
    public String stealth() {
        return ("The bomber is invisible in " + getRandomIntegerBetweenRange5(minInvisibilityDistance, maxInvisibilityDistance) + "km");
    }
    @Override
    public String nuclearAttack() {
        return ("The bomber has dropped " + getRandomIntegerBetweenRange6(minBombsQuantity, maxBombsQuantity) + " bombs");
    }
    public String moveUp() {return controls.moveUp();
    }
    public String moveDown() {return controls.moveDown();
    }
    public String moveLeft() {return controls.moveLeft();
    }
    public String moveRight() {return controls.moveRight();}
}
