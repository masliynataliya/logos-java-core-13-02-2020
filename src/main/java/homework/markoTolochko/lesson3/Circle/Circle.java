package homework.markoTolochko.lesson3.Circle;

public class Circle {
    private double radius;
    private double diametr;

    public Circle(double radius, double diametr) {
        this.radius = radius;
        this.diametr = diametr;
    }

    public void circleLenght(){
        double rezultLenght = 2 * Math.PI * radius;
        System.out.println("circleLenght = " + rezultLenght);
    }
    public void circleSquare(){
        double rezultSquare = Math.PI * Math.pow(diametr, 2) / 4;
        System.out.println("circleSquare = " + rezultSquare);
    }
}

