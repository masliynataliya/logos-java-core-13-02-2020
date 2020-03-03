package homework.katerynakikidzhan.JC03;
// Створити клас Коло. Описати його двома полями: радіус , діаметр.
// Введений може бути дробовим. Написати два методи які будуть виводити на екран площу кола і довжину кола.
// Для площі використати параметр - діаметр. Для довжини кола використати радіус.
public class Circle {
    private double r;
    private double d;

    public Circle(double r) {
        this.r = r;
        d = r * 2;
    }

    public Circle() {
        this.r = 45;
        this.d = 90;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public double length() {
        return Math.PI * d;
    }
}
