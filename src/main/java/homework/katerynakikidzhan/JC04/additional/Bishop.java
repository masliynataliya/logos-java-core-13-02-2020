package homework.katerynakikidzhan.JC04.additional;

public class Bishop extends ChessPiece {

    public Bishop(Integer locationX, Integer locationY, String colour) {
        super(locationX, locationY, 2, "Bishop", colour);
    }

    public String moveDescription() {
        return "in any direction diagonally, so long as it is not obstructed by another piece.";
    }
}
