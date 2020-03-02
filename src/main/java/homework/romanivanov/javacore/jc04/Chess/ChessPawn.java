package homework.romanivanov.javacore.jc04.Chess;

public class ChessPawn extends ChessItem {
    private String name = "Pawns";

    public ChessPawn(int x, int y, String color, int quantity) {
        super(x, y, color, quantity);
    }

    public ChessPawn(int x, int y) {
        super(x, y);
    }

    public ChessPawn(String color, int quantity) {
        super(color, quantity);
    }
    public void move(){
        System.out.println("One of "+ quantity +" " + color +" " + name + " moves at x= " + x+ " y= " +y );
    }

}
