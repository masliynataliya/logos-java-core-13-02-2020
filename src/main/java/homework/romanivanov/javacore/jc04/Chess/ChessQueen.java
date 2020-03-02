package homework.romanivanov.javacore.jc04.Chess;

public class ChessQueen extends ChessItem{
    private String name = "Queen";

    public ChessQueen(int x, int y, String color, int quantity) {
        super(x, y, color, quantity);
    }

    public ChessQueen(int x, int y) {
        super(x, y);
    }

    public ChessQueen(String color, int quantity) {
        super(color, quantity);
    }
    public void move(){
        System.out.println("One of "+ quantity +" " + color +" " + name + " moves at x= " + x+ " y= " +y );
    }

}
