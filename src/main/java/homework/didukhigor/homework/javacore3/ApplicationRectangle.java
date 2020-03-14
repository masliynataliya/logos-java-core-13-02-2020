package homework.didukhigor.homework.javacore3;

public class ApplicationRectangle {
    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle();
        Rectangle myRectangle2 = new Rectangle(2,6);



        System.out.println("Периметр прямокутника = " + myRectangle.perimeter() + " , Площа прямокутника = " + myRectangle.area());
        System.out.println("Периметр прямокутника = " + myRectangle2.perimeter() + " , Площа прямокутника = " + myRectangle2.area());

        }
    }


