package lesson.example.java.core.lesson05.acstract0;

public class ChessApp {

    public static void main(String[] args) {

        King k = new King("king1");

        ChessItem item = new King("king2");
        ChessItem item1 = (ChessItem) new King("king3");

        Queen q = new Queen("queen the second");

        printName(item);
        printName(k);
        printName(q);

        k.sayHi();
    }

    static void printName(ChessItem item) {
        System.out.println(item.getName());
    }
}
