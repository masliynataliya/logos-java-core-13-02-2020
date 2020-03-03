package homework.didukhigor.homework.javacore3;

public class ApplicationRectangle {
    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle();

        double perimeter = myRectangle.Perimeter();

        double area = myRectangle.Area();

        System.out.println("Периметр прямокутника = "+ perimeter + " , Площа прямокутника = "+ area);

    }
}

