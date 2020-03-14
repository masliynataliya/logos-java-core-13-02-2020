package homework.didukhigor.homework.javacore4.car;

public class Helm {

    private double diameter;
    private String color;

    public Helm(double diameter, String color) {
        this.diameter = diameter;
        this.color = color;
    }
    public Helm() {
        this.diameter = 45;
        this.color = "red";
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
        return "Helm{" +
                "diameter=" + diameter +
                ", color='" + color + '\'' +
                '}';
    }
    public void changeDiameter(){diameter +=2; }
    public void changeColor(){color = "Green";}
}
