package homework.didukhigor.homework.javacore3;

public class ApplicationCircle {
    public static void main(String[] args) {

        Circle myCircle = new Circle();

        double diameter = myCircle.diameter;
        double length = myCircle.length;

        System.out.println("Площа кола = " + (Math.PI * diameter * diameter) / 4 + "  Довжина кола = " + length);

    }
}
