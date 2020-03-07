package homework.denysyerchenko.lesson07;

import java.util.Random;

public abstract class Bomber {

    int length;
    int width;
    int weight;
    int minTime = 20;
    int maxTime = 88;
    double minKm = 0;
    double maxKm = 1000;

    Bomber(int length, int width, int weight) {
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public int getRandomIntegerBetweenRange2(int minTime, int maxTime) {
        Random t = new Random();
        return t.nextInt((maxTime - minTime) + 1) + minTime;
    }
    private double getRandomIntegerBetweenRange3(double minKm, double maxKm) {
        double k = new Random().nextDouble();
        double kilometers = minKm + (k *(maxKm - minKm));
        return kilometers;
    }

    String startEngine() {
        return ("The engine wil start in " + getRandomIntegerBetweenRange2(minTime, maxTime) + " seconds");
    }
    String takeOff() {
        return ("The bomber can take " + getRandomIntegerBetweenRange3(minKm, maxKm) + " with a full tank");
    }
    String landing() {
        return ("The bomber is going to land");
    }
}
