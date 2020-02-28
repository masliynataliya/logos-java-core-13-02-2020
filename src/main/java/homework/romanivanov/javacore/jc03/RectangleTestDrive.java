package homework.romanivanov.javacore.jc03;

public class RectangleTestDrive {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(15,20);
        System.out.println(rec1);
        rec1.perimeter();
        rec1.square();
        //Метод square і perimeter для конструктора з парметрами



        Rectangle rec2 = new Rectangle();
        System.out.println(rec2);
        rec2.square();
        rec2.perimeter();
        //Метод square і perimeter для конструктора без парметрів


        rec1.setLength(2);
        System.out.println(rec1);
        rec1.square();
        rec1.perimeter();
        //метод set


        int rec2Type = rec2.getLength();
        System.out.println(rec2Type);
        //пробую метод get

    }
}
