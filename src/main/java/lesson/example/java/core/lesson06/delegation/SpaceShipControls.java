package lesson.example.java.core.lesson06.delegation;

public class SpaceShipControls {

    public int moveX(int x, int engine) {
        System.out.printf("Ship moved for %s km\n", engine);
        return x + engine;
    }

    public int moveXFast(int x, int engine) {
        System.out.printf("Ship moved fast for %s km\n", engine * 2);
        return x + 2*engine;
    }
}

