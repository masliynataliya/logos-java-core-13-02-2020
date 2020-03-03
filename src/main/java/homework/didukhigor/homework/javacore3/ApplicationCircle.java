package homework.didukhigor.homework.javacore3;

import java.util.concurrent.Callable;

public class ApplicationCircle {
    public static void main(String[] args) {

        Circle myCircle = new Circle();

        double Area = myCircle.Area();
        double Length = myCircle.Length();


        System.out.println("Площа кола = " + Area + "  Довжина кола = " + Length);

    }
}

