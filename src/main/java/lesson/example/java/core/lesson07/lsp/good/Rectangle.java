package lesson.example.java.core.lesson07.lsp.good;

public class Rectangle implements AreaCountable{

    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int area() {
        return width * height;
    }
}
