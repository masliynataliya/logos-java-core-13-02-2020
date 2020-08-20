package homework.mikekhay.hwjavacore12.number1;

public class Engine {
    private int numberCylinders;

    public Engine(){
        numberCylinders = 2 + (int) (Math.random() * 6);
    }

    public int getNumberCylinders() {
        return numberCylinders;
    }

    public void setNumberCylinders(int numberCylinders) {
        this.numberCylinders = numberCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "numberCylinders=" + numberCylinders +
                '}';
    }
}
