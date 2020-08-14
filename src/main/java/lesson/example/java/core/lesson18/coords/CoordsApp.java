package lesson.example.java.core.lesson18.coords;

public class CoordsApp {

    public static void main(String[] args) {

        Coords<Coords.TwoC> coords2 = new Coords(new Coords.TwoC(1,2));
        Coords<Coords.TreeC> coords3 = new Coords(new Coords.TreeC(31,32, 33));
        Coords<Coords.FourC> coords4 = new Coords(new Coords.FourC(401, 402, 403, 404));

        Coords.showCoordXY(coords2);
        Coords.showCoordXY(coords3);
        Coords.showCoordXY(coords4);


        Coords.showCoordXYZ(coords3);
        Coords.showCoordXYZ(coords4);

        Coords.showCoordXYZT(coords4);

        Coords.showCoordXYSuper(coords2);
        Coords.showCoordXYSuper(coords3);
        Coords.showCoordXYSuper(coords4);

    }
}
