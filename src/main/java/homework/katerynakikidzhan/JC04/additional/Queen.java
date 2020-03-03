package homework.katerynakikidzhan.JC04.additional;

public class Queen extends ChessPiece {

    public Queen(Integer locationX, Integer locationY, String colour) {
        super(locationX, locationY, 1, "Queen", colour);
    }
    public String moveDescription() {
        return "in any direction on a straight or diagonal path.";
    }
}
