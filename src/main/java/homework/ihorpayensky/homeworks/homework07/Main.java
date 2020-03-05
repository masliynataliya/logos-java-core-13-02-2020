package homework.ihorpayensky.homeworks.homework07;

public class Main {
    public static void main(String[] args) {
        Cy27 plane = new Cy27(40,40,40,400,"Black");

        plane.starting();
        plane.fly();
        plane.getPb().moveUp();
        plane.getPb().moveDown();
        plane.getPb().moveLeft();
        plane.getPb().moveRight();
        plane.getPb().getKm();
        plane.invisible();
        plane.nuclearBit();
        plane.boost();
        plane.landing();
    }
}
