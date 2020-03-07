package homework.denysyerchenko.lesson03.fishes;

public class Fish {
    private String name;
    private String color;
    private int size;

    public Fish(String initName, String initColor, int initSize) {
        name = initName;
        color = initColor;
        size = initSize;
    }
    public Fish(String initName, int initSize) {
        name = initName;
        size = initSize;
    }
    public Fish(int initSize, String initColor) {
        size = initSize;
        color = initColor;
    }
    public Fish(String initName) {
        name = initName;
    }
    public Fish() {

    }
    public Fish(int initSize) {
        size = initSize;
    }
     public Fish(String initName, String initColor) {
        name = initName;
        color = initColor;
     }

    @Override
    public String toString() {
        return "Fish[Name = " + name + "; Color = " + color + "; Size = " + size + "]";
    }
}
