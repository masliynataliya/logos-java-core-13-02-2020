package homework.mikekhay.hmjavacore07.number1;

import java.util.Random;

class Aiplenet {

    static Random random = new Random();

    protected static void startmotor() {
        System.out.println("Starts motors airplenet = " + (20 + random.nextInt(68) + "c"));
    }

    protected static void vzlitlitaka() {
        System.out.println("Takeoff of the plane. Will be held on the full tank of fuel = " + random.nextInt() + "Km");

    }

    protected static void posadka() {
        System.out.println("Airplenet is landing !");
    }
}



