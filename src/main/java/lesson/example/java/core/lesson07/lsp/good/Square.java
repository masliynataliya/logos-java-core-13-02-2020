package lesson.example.java.core.lesson07.lsp.good;

public class Square implements AreaCountable {

    private int width;

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int area() {
        return width* width;
    }
}
