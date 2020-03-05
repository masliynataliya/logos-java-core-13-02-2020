package homework.ihorpayensky.homeworks.homework07;

import java.util.Random;

class PlaneController {
    private Random random = new Random();
    private double km = 0;

    public void getKm() {
        System.out.printf("All km: %s\n", this.km);
    }

    protected void moveUp() {
        int temp = random.nextInt(1000);
        km += temp;
        System.out.printf("Move up: %s\n", random.nextInt(1000));
    }
    protected void moveDown() {
        int temp = random.nextInt(1000);
        km += temp;
        System.out.printf("Move down: %s\n", random.nextInt(1000));
    }
    protected void moveRight() {
        int temp = random.nextInt(1000);
        km += temp;
        System.out.printf("Move right: %s\n", random.nextInt(1000));
    }
    protected void moveLeft() {
        int temp = random.nextInt(1000);
        km += temp;
        System.out.printf("Move left: %s\n", random.nextInt(1000));
    }


}
