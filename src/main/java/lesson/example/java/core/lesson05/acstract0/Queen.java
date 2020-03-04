package lesson.example.java.core.lesson05.acstract0;

public class Queen extends ChessItem {

    public Queen(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Queen go");
    }
}
