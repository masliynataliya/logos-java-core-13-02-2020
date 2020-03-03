package lesson.example.java.core.lesson06.interfaces.game;

public class Game {

    public static void main(String[] args) {

        Batman batman = new Batman();
        Robot robot = new Robot();
        Robin robin = new Robin();
        Turelle turelle = new Turelle();

        robin.eat();
        batman.eat();

        Human.hello();
    }

    public static void move(Movable movable) {
        movable.move();
    }

    public static void talk(Human human) {
        human.talk();
    }
}
