package homework.markoTolochko.lesson12CarArray;

import java.util.Random;

public class Car {
    private int enginePower;
    private int age;
    private SteeringWheel steeringWheel;
    private Engine engine;


    public Car() {
        Random random = new Random();
        this.enginePower = random.nextInt(900);
        this.age = random.nextInt(20);
        this.engine = new Engine();
        this.steeringWheel = new SteeringWheel();
    }

    public Car(int enginePower, int age, SteeringWheel steeringWheel, Engine engine) {
        this.enginePower = enginePower;
        this.age = age;
        this.steeringWheel = steeringWheel;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "enginePower=" + enginePower +
                ", age=" + age +
                ", steeringWheel=" + steeringWheel +
                ", engine=" + engine +
                '}';
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
