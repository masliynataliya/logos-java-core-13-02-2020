package homework.denysyerchenko.lesson11;

import java.util.Random;

public class Helm {
    private int helmDiameter;
    private String helmMaterial;

    public Helm(int helmDiameter, String helmMaterial) {
        Random random1 = new Random();
        helmDiameter = random1.nextInt((50 - 30) + 1);
        helmMaterial = helmMaterial;
        Random random2 = new Random();
        int randomNum = random2.nextInt((2 - 1) + 1);
        if (randomNum == 2) {
            helmMaterial.equals("leather");
        } else {
            helmMaterial.equals("alcantara");
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
        return "Helm{" +
                "helmDiameter=" + helmDiameter +
                ", helmMaterial='" + helmMaterial + '\'' +
                '}';
    }
}
