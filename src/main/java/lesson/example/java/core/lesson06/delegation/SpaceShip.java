package lesson.example.java.core.lesson06.delegation;

public class SpaceShip {

    private int size;
    private int engine;
    private int x;
    private int y;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShip(int engine) {
        this.engine = engine;
        this.x = 0;
    }

    public void moveForward(){
        x = controls.moveX(x, engine);
    }

    public void moveForwardFast(){
        x = controls.moveXFast(x, engine);
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
            "engine=" + engine +
            ", x=" + x +
            '}';
    }
}
