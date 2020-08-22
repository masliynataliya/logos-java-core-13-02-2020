package homework.markoTolochko.lesson11Car;

import java.util.Random;

public class SteeringWheel {
    int diameter;
    String material;

    public SteeringWheel() {
        Random random = new Random();
        String[] materials = { "leather", "alcantara"};

        this.diameter = random.nextInt(50);
        this.material = materials[random.nextInt(materials.length)];
    }

    public SteeringWheel(int diameter, String material) {
        this.diameter = diameter;
        this.material = material;
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
