package homework.romanivanov.javacore.jc03;

public class Rectangle {

    protected int length;
    private int wide;

    public Rectangle(int InitLength, int InitWide) {
        length = InitLength;
        wide = InitWide;
    }


    public Rectangle() {
        this.length = 8;
        this.wide = 4;


    }
    public void setLength(int newLength){
        length = newLength;
    }

    public int getLength (){
        return length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", wide=" + wide +
                '}';

    }


    public void perimeter() {

        System.out.println("Периметр прямокутника = " + (2 *(length + wide)));


    }
    public void square() {
        System.out.println("Площа прямокутника = " + (length * wide));
    }
}
