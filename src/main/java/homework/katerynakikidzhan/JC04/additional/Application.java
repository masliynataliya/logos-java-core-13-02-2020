package homework.katerynakikidzhan.JC04.additional;

public class Application {
    public static void main(String[] args) {
        King king = new King(5, 8, "white");
        Queen queen = new Queen(4, 1, "black");
        Bishop bishop = new Bishop(3, 8, "white");
        Knight knight = new Knight(2, 1, "black");
        Rook rook = new Rook(8, 1, "white");
        Pawn pawn = new Pawn(4, 2, "black");

        ChessPiece[] chessPieces = {king, queen, bishop, knight, rook, pawn};

        for (int i = 0; i < chessPieces.length; i++) {
            chessPieces[i].move();
        }
    }
}
