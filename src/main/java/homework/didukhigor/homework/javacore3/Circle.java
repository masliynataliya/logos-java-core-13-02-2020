package homework.didukhigor.homework.javacore3;

public class Circle {

    private double radius ;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(){
        this.radius = 15;
    }

    public double diameter(){return radius*2;}

    public double length(){return (2*(Math.PI*radius));}

    }


