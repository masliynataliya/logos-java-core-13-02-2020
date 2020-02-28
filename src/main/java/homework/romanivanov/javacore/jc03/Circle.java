package homework.romanivanov.javacore.jc03;

public class Circle {

    protected double radius;
    protected double diameter;

    public void square1(double newDiameter){
        diameter = newDiameter;
        double s = (Math.PI*(diameter * diameter)) / 4;
        System.out.println("Площа кола дорівнює - " + s + "(см)^2");

    }
    public void length1(double newRadius){
        radius = newRadius;
        double l = 2*Math.PI * radius;
        System.out.println("Довжина кола дорівнює - " + l + "(см)");

    }

}
