package homework.katerynakikidzhan.JC04.additional;

public class Pawn extends ChessPiece {

    public Pawn(Integer locationX, Integer locationY, String colour) {
        super(locationX, locationY, 8, "Pawn", colour);
    }

    public String moveDescription() {
        return "forward for one square.";
    }
}
