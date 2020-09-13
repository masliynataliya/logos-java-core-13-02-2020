package homework.markoTolochko.lesson11Car;

import java.util.Random;

public class Engine {

    int cylinderCount;
    public Engine() {
        Random random = new Random();
        this.cylinderCount = random.nextInt(16);
    }

    public Engine(int cylinderCount) {
        this.cylinderCount = cylinderCount;
    }

    public int getCylinderCount() {
        return cylinderCount;
    }

    public void setCylinderCount(int cylinderCount) {
        this.cylinderCount = cylinderCount;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylinderCount=" + cylinderCount +
                '}';
    }
}
