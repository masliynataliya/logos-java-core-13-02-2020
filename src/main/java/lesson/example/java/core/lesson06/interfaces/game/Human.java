package lesson.example.java.core.lesson06.interfaces.game;

public interface Human extends Movable {

    public void talk();

    default void eat() {
        System.out.println("yammy");
    }

    static void hello() {
        System.out.println("Hello");
    }

}
