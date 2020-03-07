package homework.denysyerchenko.lesson03.circle;

public class Circle {
    public double radius;
    public double diameter;
    public double p = 3.14;

    public Circle(double initRadius, double initDiameter) {
        radius = initRadius;
        diameter = initDiameter;
    }
    public Circle() {

    }

    public void findArea(double diameter) {
        {
            System.out.println("The area of the circle = " + ((p / 4) * (diameter * diameter)));
        }
    }

    public void findCircumference(double radius) {
        {
            System.out.println("The circumference of the circle = " + ((p * 2) * radius));
        }
    }
}
