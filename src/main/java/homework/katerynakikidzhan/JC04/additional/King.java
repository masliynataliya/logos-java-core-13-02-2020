package homework.katerynakikidzhan.JC04.additional;

public class King extends ChessPiece {

    public King(Integer locationX, Integer locationY, String colour) {
        super(locationX, locationY, 1, "King", colour);
    }

    public String moveDescription() {
        return "one single square in any direction.";
    }
}
