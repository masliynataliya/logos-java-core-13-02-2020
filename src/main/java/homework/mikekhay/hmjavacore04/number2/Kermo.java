package homework.mikekhay.hmjavacore04.number2;

public class Kermo {
    private  double diameter;
    private String color;
    private String material;

    public  Kermo() {
        this.color = "While";
        this.diameter = 13;
        this.material = "Chkira";
    }


    public Kermo(double diameter, String  color, String material){
        this.color = color;
        this.diameter = diameter;
        this.material = material;
    }
    public double getDiameter(){
        return diameter;
    }
    public void setDiameter(double diameter){
        this.diameter = diameter;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }


    @Override
    public String toString(){
        return " Kermo Diametr " + this.diameter + " Color " + this.color + " Material " + this.material;
    }
}
