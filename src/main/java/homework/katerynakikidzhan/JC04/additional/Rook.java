package homework.katerynakikidzhan.JC04.additional;

public class Rook extends ChessPiece {

    public Rook(Integer locationX, Integer locationY, String colour) {
        super(locationX, locationY, 2, "Rook", colour);
    }

    public String moveDescription() {
        return "forward, backward, left or right.";
    }
}
