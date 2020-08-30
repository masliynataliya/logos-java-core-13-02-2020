package homework.romanivanov.javacore.jc12hw.car;

public class Engine {
    private final int numberOfCylinders;


    public Engine() {
        numberOfCylinders = HelpTools.rnd(2, 6);

    }


    @Override
    public String toString() {
        return "Engine{" +
                "numberOfCylinders=" + numberOfCylinders +
                '}';
    }


}
