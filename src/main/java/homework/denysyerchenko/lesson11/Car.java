package homework.denysyerchenko.lesson11;

import java.util.Random;

public class Car {
   private int horsePowers;
   private int yearOfManufacture;
   private Helm helm;
   private Engine engine;

    public Car() {
        Random random = new Random();
        horsePowers = random.nextInt(((850 - 200) + 1) + 200);
        yearOfManufacture = random.nextInt(((2019 - 1989) +1) + 1989);
        this.helm = helm;
        this.engine = engine;
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
        return "Car{" +
                "horsePowers= " + horsePowers +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                ", helm=" + helm +
                ", engine=" + engine +
                '}';
    }
}