package homework.denysyerchenko.lesson11;

import java.util.Random;

public class Engine {
    private int numberOfCylinders;

    public Engine(int numberOfCylinders) {
        Random random3 = new Random();
        this.numberOfCylinders = random3.nextInt((12 - 4) + 1);
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "numberOfCylinders=" + numberOfCylinders +
                '}';
    }
}
