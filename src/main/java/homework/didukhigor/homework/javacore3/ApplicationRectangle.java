package homework.didukhigor.homework.javacore3;

public class ApplicationRectangle {
    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle();

        double perimeter = myRectangle.perimeter();
        double area = myRectangle.area();

        Rectangle myRectangle2 = new Rectangle();

        System.out.println("Периметр прямокутника = "+ perimeter + " , Площа прямокутника = "+ area);
        System.out.println("Периметр прямокутника = "+ perimeter + " , Площа прямокутника = "+ area);

    }
}

