package homework.ihorpayensky.homeworks.homework11.task2;

import java.util.Random;

class Helm {
    private int diameter;
    private String material;

    public Helm() {
        Random r = new Random();
        String[] materials = { "leather", "alcantara", "polycarbonat", "plastic"};

        this.diameter = r.nextInt(30 - 15 + 1) + 15;
        this.material = materials[r.nextInt(materials.length)];
    }

    public Helm(int diameter, String material) {
        this.diameter = diameter;
        this.material = material;
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

    @Override
    public String toString() {
        return "Helm{" +
                "diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }
}
