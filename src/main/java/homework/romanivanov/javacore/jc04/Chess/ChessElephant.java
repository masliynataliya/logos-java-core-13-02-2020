package homework.romanivanov.javacore.jc04.Chess;

public class ChessElephant extends ChessItem {
    protected String name = "Elephants";
    public ChessElephant(int x, int y, String color, int quantity) {
        super(x, y, color, quantity);
    }

    public ChessElephant(int x, int y) {
        super(x, y);
    }

    public ChessElephant(String color, int quantity) {
        super(color, quantity);
    }
public void move(){
    System.out.println("One of "+ quantity +" " + color +" " + name + " moves at x= " + x+ " y= " +y );
}

}
