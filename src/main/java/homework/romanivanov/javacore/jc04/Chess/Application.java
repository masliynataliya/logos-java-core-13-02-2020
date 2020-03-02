package homework.romanivanov.javacore.jc04.Chess;

public class Application {
    public static void main(String[] args) {
        ChessTower tower1 = new ChessTower(23,24,"White",2);
        tower1.move();
        ChessElephant elephant1 = new ChessElephant(10,5,"Black",2);
        elephant1.move();
        ChessHorse horse1 = new ChessHorse(4,6);
        horse1.move();
        ChessKing king1 = new ChessKing(5,7,"Black",1);
        king1.move();
        ChessPawn pawn1 = new ChessPawn(5,3,"White",6);
        pawn1.move();
        ChessQueen queen1 = new ChessQueen(3,4,"White",1);
        queen1.move();


    }
}
