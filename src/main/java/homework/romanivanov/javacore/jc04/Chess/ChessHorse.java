package homework.romanivanov.javacore.jc04.Chess;

public class ChessHorse extends  ChessItem {
    private String name  = "Horses";

    public ChessHorse(int x, int y, String color, int quantity) {
        super(x, y, color, quantity);
    }

    public ChessHorse(int x, int y) {
        super(x, y);
    }

    public ChessHorse(String color, int quantity) {
        super(color, quantity);
    }
    public void move(){
        System.out.println("One of "+ quantity +" " + color +" " + name + " moves at x= " + x+ " y= " +y );
    }

}
