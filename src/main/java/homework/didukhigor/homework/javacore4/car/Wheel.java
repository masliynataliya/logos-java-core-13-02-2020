package homework.didukhigor.homework.javacore4.car;

public class Wheel {

    private double diameter;
    private String color;


    public Wheel(double diameter, String color) {
        this.diameter = diameter;
        this.color = color;
    }
    public Wheel() {
        this.diameter = 78;
        this.color = "black";
    }
    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                ", color='" + color + '\'' +
                '}';
    }
    public void changeDiameter(){diameter *=2;}
    public void changeColor(){color = "Black";}

}
