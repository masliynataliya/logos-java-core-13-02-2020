package homework.romanivanov.javacore.jc12hw.car;

public class Car {

    private final int releaseDate;
    private final int power;
    private final Engine engine;
    private final SteeringWheel steeringWheel;


    public Car(Engine engine, SteeringWheel steeringWheel) {
        releaseDate = HelpTools.rnd(1980, 2019);
        power = HelpTools.rnd(100, 200);
        this.engine = engine;
        this.steeringWheel = steeringWheel;
    }


    @Override
    public String toString() {
        return "\n" + "Car{" + "\n" +
                " releaseDate=" + releaseDate +
                " power=" + power +
                " engine=" + engine +
                " steeringWheel=" + steeringWheel +
                '}' + "\n";
    }


}
