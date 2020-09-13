package homework.markoTolochko.lesson3.Circle.lesson3.lessone3Rectangle;

public class Rectangle {
    private int lenght;
    private int width;



    public Rectangle() {
        this.lenght = 20;
        this.width = 10;
    }

    public Rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }
    public void perimetr(){
        int rezultPerimetr = (lenght + width) * 2;
        System.out.println("perimetr = " + rezultPerimetr);

    }
    public void square(){
        int rezultSquare = lenght * width;
        System.out.println("square = " + rezultSquare);
    }
}
