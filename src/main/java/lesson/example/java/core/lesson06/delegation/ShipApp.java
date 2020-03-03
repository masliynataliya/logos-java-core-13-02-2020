package lesson.example.java.core.lesson06.delegation;

public class ShipApp {

    public static void main(String[] args) {

        SpaceShip ship= new SpaceShip(12);
        System.out.println(ship);
        ship.moveForward();
        System.out.println(ship);
        ship.moveForwardFast();
        System.out.println(ship);
    }
}
