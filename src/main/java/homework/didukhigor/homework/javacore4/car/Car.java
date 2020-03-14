package homework.didukhigor.homework.javacore4.car;

import java.awt.*;

import static java.awt.Color.*;

public class Car {


    private String color;
    private Helm helm;
    private Wheel wheel;
    private Body body;

    public Car() {
        this.color = "yellow";
        this.helm = new Helm();
        this.wheel = new Wheel();
        this.body = new Body();
    }
    public Car(String color, Helm helm, Wheel wheel, Body body) {
        this.color = color;
        this.helm = helm;
        this.wheel = wheel;
        this.body = body;
    }

    public Car(Body wood, Helm pink, Wheel purple) {
    }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public Helm getHelm() { return helm; }

    public void setHelm(double diameter, String color) { this.helm = helm; }

    public Wheel getWheel() { return wheel; }

    public void setWheel(double diameter, String color) { this.wheel = wheel; }

    public Body getBody() { return body; }

    public void setBody(double numberOfSits, String bodeTypes) { this.body = body; }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", helm=" + helm +
                ", wheel=" + wheel +
                ", body=" + body +
                '}';
    }
}
