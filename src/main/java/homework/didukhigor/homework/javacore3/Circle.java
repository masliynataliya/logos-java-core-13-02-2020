package homework.didukhigor.homework.javacore3;

public class Circle {

    public static void main(String[] args) {
        double radius = 12;

        double diameter= radius*2;

        double length =(2*(Math.PI*radius));


        System.out.println("Площа кола = " +  (Math.PI*diameter*diameter)/4 + "  Довжина кола = " + length);

    }
}

