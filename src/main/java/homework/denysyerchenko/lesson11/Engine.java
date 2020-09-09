package homework.denysyerchenko.lesson11;

import java.util.Random;

public class Engine {
    private int numberOfCylinders;

    public Engine() {
        Random random5 = new Random();
        this.numberOfCylinders = random5.nextInt((12 - 4) + 1);
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return "number of cylinders: " + numberOfCylinders;
    }
}
