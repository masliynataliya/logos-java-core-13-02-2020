package homework.didukhigor.homework.javacore3;

public class ApplicationRectangle {
    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle();
        Rectangle myRectangle2 = new Rectangle(24,34);

        double perimeter = myRectangle.perimeter();
        double area = myRectangle.area();

        System.out.println("Периметр прямокутника = " + perimeter + " , Площа прямокутника = " + area);

        }
    }


