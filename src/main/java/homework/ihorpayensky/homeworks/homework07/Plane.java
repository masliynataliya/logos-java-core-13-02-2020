package homework.ihorpayensky.homeworks.homework07;

import java.util.Random;

abstract class Plane {

    private double weight;
    private double width;
    private double height;
    protected static Random r = new Random();

    public Plane(double weight, double width, double height) {
        this.weight = weight;
        this.width = width;
        this.height = height;
    }

    protected void starting() {
        System.out.printf("Time to start: %sm\n", (r.nextInt(88 - 20)+20));
    }

    protected void fly() {
        System.out.printf("Boil: %sl\n", randDouble(0, 1000));
    }

    protected void landing() {
        System.out.println("The plane is landing!");
    }

    protected static double randDouble(double min, double max) {
        Random rand = new Random();
        return rand.nextFloat() * (max - min) + min;
    }
}
