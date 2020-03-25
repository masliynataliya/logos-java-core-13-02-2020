package homework.mikekhay.hmjavacore07.number1;

import java.util.Random;

public abstract class Aiplenet implements Accessibility{

    private double dow;
    private double chur;
    private double mas;
    public double speed;

    public Aiplenet(double dow, double chur, double mas) {
        this.dow = dow;
        this.chur = chur;
        this.mas = mas;
    }

    Random random = new Random();

    public void startmotor() {
        System.out.println("Starts motors airplenet = " + (20 + random.nextInt(68) + " c"));
    }

    public void vzlitlitaka() {
        System.out.printf("Takeoff of the plane. Will be held on the full tank of fuel %s km. ",random.nextInt(1000));
        System.out.println();
    }

    public void posadka() {
        System.out.println("Airplenet is landing !");
    }

}



