package lesson.example.java.core.lesson05.acstract0;

public abstract class ChessItem {

    private String color;
    private  int x;
    private  int y;
    private String name;

    public abstract void move();

    public String getName() {
        return name;
    }

    public ChessItem(String name){
        this.name = name;
    }
}
