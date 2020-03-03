package homework.romanivanov.javacore.jc04.Chess;

public class ChessKing extends ChessItem {
    private String name = "King";

    public ChessKing(int x, int y, String color, int quantity) {
        super(x, y, color, quantity);
    }

    public ChessKing(int x, int y) {
        super(x, y);
    }

    public ChessKing(String color, int quantity) {
        super(color, quantity);
    }
    public void move(){
        System.out.println("One of "+ quantity +" " + color +" " + name + " moves at x= " + x+ " y= " +y );
    }

}
