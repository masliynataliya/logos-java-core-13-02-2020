package lesson.example.java.core.lesson18.coords;

public class Coords<T extends Coords.TwoC> {

    private T coord;

    public Coords(T coord) {
        this.coord = coord;
    }

    public T getCoord() {
        return coord;
    }


    public static void showCoordXY(Coords<?> c) {
        System.out.println("x : " + c.getCoord().getX());
        System.out.println("y : " + c.getCoord().getY());
        System.out.println();
    }

    public static void showCoordXYZ(Coords<? extends TreeC> c) {
        System.out.println("x : " + c.getCoord().getX());
        System.out.println("y : " + c.getCoord().getY());
        System.out.println("z : " + c.getCoord().getZ());
        System.out.println();
    }

    public static void showCoordXYZT(Coords<? extends FourC> c) {
        System.out.println("x : " + c.getCoord().getX());
        System.out.println("y : " + c.getCoord().getY());
        System.out.println("z : " + c.getCoord().getZ());
        System.out.println("t : " + c.getCoord().getT());
        System.out.println();
    }

    public static void showCoordXYSuper(Coords<? super FourC> c) {
        System.out.println("x : " + c.getCoord().getX());
        System.out.println("y : " + c.getCoord().getY());
        System.out.println();
    }

    static class TwoC {
        private int x;
        private int y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public TwoC(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class TreeC extends TwoC{
        private int z;

        public int getZ() {
            return z;
        }

        public TreeC(int x, int y, int z) {
            super(x, y);
            this.z = z;
        }
    }

    static class FourC extends TreeC {

        private int t;

        public int getT() {
            return t;
        }

        public FourC(int x, int y, int z, int t) {
            super(x, y, z);
            this.t = t;
        }
    }


}
