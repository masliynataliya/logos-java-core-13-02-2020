package homework.ihorpayensky.homeworks.homework11.task2;

import java.util.Random;

class Engine {
    private int cylinders;

    public Engine() {
        Random r = new Random();
        this.cylinders = r.nextInt(8-2+1)+2;
    }

    public Engine(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylinders=" + cylinders +
                '}';
    }
}
