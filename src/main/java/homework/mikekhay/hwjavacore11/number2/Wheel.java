package homework.mikekhay.hwjavacore11.number2;

public class Wheel {

    //kолесо
    private double diametr;
    private String color;
    private double width;

    public Wheel() {
        this.diametr = 25.5;
        this.color = "Red";
        this.width = 17;
    }
    public Wheel(double diametr, String color, double width){
        this.diametr = diametr;
        this.color = color;
        this.width = width;
    }
    public double getDiametr() {
        return diametr;
    }
    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    @Override
    public  String toString() {
        return "   Wheel Diametr " + this.diametr + " Color " + this.color + " Width " + this.width;
    }

}
