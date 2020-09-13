package homework.denysyerchenko.lesson11.cars;

import java.util.Random;

public class Car {
   private int horsePowers;
   private int yearOfManufacture;
   private Helm helm;
   private Engine engine;

    public Car() {
        Random random1 = new Random();
        horsePowers = random1.nextInt((850-150)+1)+150;
        Random random2 = new Random();
        yearOfManufacture = random2.nextInt((2019-1985)+1)+1985;
        this.helm = new Helm();
        this.engine = new Engine();
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car: " +
                "horse powers: " + horsePowers +
                ", year of manufacture: " + yearOfManufacture +
                "; helm: " + helm +
                "; engine: " + engine;
    }
}