package homework.denysyerchenko.lesson12.carsAL;

import java.util.Random;

public class Helm {
    private int helmDiameter;
    private String helmMaterial;

    public Helm() {
        Random random3 = new Random();
        this.helmDiameter = random3.nextInt((50-30)+1)+30;
        this.helmMaterial = helmMaterial;
        Random random4 = new Random();
        int randomNum = random4.nextInt((2-1)+1)+1;
        if (randomNum == 2) {
            helmMaterial = "leather";
        } else {
            helmMaterial = "alcantara";
        }
    }

    public int getHelmDiameter() {
        return helmDiameter;
    }

    public void setHelmDiameter(int helmDiameter) {
        this.helmDiameter = helmDiameter;
    }

    public String getHelmMaterial() {
        return helmMaterial;
    }

    public void setHelmMaterial(String helmMaterial) {
        this.helmMaterial = helmMaterial;
    }

    @Override
    public String toString() {
        return "diameter: " + helmDiameter +
                ", material: " + helmMaterial;
    }
}
