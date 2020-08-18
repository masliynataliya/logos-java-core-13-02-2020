package homework.mikekhay.hwjavacore12.number1;

public class Kermo {

    private double diameter;
    private String material;

    public Kermo() {
        diameter = 6 + (int) ( Math.random() * 4 );
        double number = Math.random();
        if(number<0.5){ material="Leather"; }
        else {material="Alcantara"; }
    }

    public double getDiameter() {
        return diameter;
    }

    public String getMaterial() {
        return material;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Kermo{" +
                "diameter=" + diameter +
                ", material='" + material + '\'' +
                '}';
    }
}
