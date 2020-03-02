package homework.romanivanov.javacore.jc04.Chess;

public class ChessTower extends ChessItem {
    private String name = "Tower";


    public ChessTower(int x, int y, String color, int quantity) {
        super(x, y, color, quantity);

    }

    public ChessTower(int x, int y) {
        super(x, y);

    }

    public ChessTower(String color, int quantity) {
        super(color, quantity);

    }

    public void move(){
        System.out.println("One of "+ quantity +" " + color +" " + name + " moves at x= " + x+ " y= " +y );
    }





}

