
package homework.didukhigor.homework.javacore3;

public class Rectangle {

    double length;
    double width;

    public Rectangle(double length,double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this.length = 15;
        this.width = 30;
    }


    double perimeter() {
        return (length * 2) + (width * 2);
    }
    double perimeter2() {
        return (length * 2) + (width * 2);
    }

    double area() {
        return length * width;
    }
    double area2() {
        return length * width; }


}


