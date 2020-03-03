package homework.didukhigor.homework.javacore3;

import java.util.concurrent.Callable;

public class ApplicationCircle {
    public static void main(String[] args) {
       Circle myCircle = new Circle();
       double area = myCircle.Area();
       double length = myCircle.Length();
        System.out.println("Площа кола = "+ area+ "Довжина кола = "+ length);
       }
            }

