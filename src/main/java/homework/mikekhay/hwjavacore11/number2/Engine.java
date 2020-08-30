package homework.mikekhay.hwjavacore11.number2;

public class Engine {
    private int numberCylinders;

    public Engine(){
        numberCylinders = 2 + (int) (Math.random() * 6);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "numberCylinders=" + numberCylinders +
                '}';
    }
}
