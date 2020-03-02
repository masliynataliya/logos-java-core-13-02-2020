package homework.romanivanov.javacore.jc04.Chess;

public class ChessItem {


    protected int x;
    protected int y;
    //координати

    protected String color;
    protected String name;

    protected int quantity;
    //кількість


    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setQuantity(int quantity) {
        quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ChessItem(int x, int y, String color, int quantity) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.quantity = quantity;
    }
    public ChessItem (int x, int y) {
        this.x = x;
        this.y = y;

    }
    public ChessItem (String color, int quantity) {
        this.color = color;
        this.quantity = quantity;
    }



    public void move(){
        System.out.println("One of "+ color + quantity + name + "moves at x= " + x+ "y= " +y );

    }
}




