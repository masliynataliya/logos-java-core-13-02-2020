package homework.katerynakikidzhan.JC04.additional;

public class Knight extends ChessPiece {

    public Knight(Integer locationX, Integer locationY, String colour) {
        super(locationX, locationY, 2, "Knight", colour);
    }

    public String moveDescription() {
        return "forward, backward, left or right two squares and must then move one square in either perpendicular direction.";
    }
}
