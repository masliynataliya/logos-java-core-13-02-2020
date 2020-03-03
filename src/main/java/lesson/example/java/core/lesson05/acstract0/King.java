package lesson.example.java.core.lesson05.acstract0;

public class King extends ChessItem {

    @Override
    public void move() {
        System.out.println("King go");
    }

    public King(String name) {
        super(name);
    }

    public void sayHi() {
        System.out.println("hi");
    }
}
