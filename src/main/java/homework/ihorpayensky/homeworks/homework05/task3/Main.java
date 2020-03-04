package homework.ihorpayensky.homeworks.homework05.task3;

import java.util.Random;

class Main {
    public static void main(String[] args) {
        Float[] f = new Float[10];
        Double[] d = new Double[10];

        for (int i = 0; i < f.length; i++) {
            f[i] = randFloat(0,100);
            d[i] = randDouble(0,100);
        }

        float fMax = 0, fMin = 0;
        double dMax = 0, dMin = 0;

        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                fMin = f[i];
                dMin = d[i];
            }
            if (fMin > f[i]) fMin = f[i];
            if (fMax < f[i]) fMax = f[i];
            if (dMax < f[i]) dMax = d[i];
            if (dMin > d[i]) dMin = d[i];
        }


        System.out.println("\n === Floats === ");
        System.out.printf(" Max: %s\n", fMax);
        System.out.printf(" Min: %s\n", fMin);
        for (Float e: f) {
            System.out.println(e.toString());
        }

        System.out.println("\n === Doubles === ");
        System.out.printf(" Max: %s\n", dMax);
        System.out.printf(" Min: %s\n", dMin);
        for (Double e: d) {
            System.out.println(e.toString());
        }


    }
    private static double randDouble(double min, double max) {
        Random rand = new Random();
        return rand.nextFloat() * (max - min) + min;
    }

    public static float randFloat(float min, float max) {
        Random rand = new Random();
        return rand.nextFloat() * (max - min) + min;
    }
}
