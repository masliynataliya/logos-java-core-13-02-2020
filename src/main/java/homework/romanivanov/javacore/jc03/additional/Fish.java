package homework.romanivanov.javacore.jc03.additional;

public class Fish {
    private String color;
    private String name;
    int size;


    public Fish() {

    }

    public Fish(String newColor) {
        color = newColor;
    }

    public Fish(int newSize) {
        size = newSize;
    }

    public Fish(String newName, String new1Color) {
        name = newName;
        color = new1Color;
    }

    public Fish(String new1Name, int new1Size) {
        name = new1Name;
        size = new1Size;
    }

    public Fish(int new2Size, String new2Color) {
        size = new2Size;
        color = new2Color;
    }

    public Fish(String color, String name, int size) {
        this.color = color;
        this.name = name;
        this.size = size;
        //this використовується для зміної, щоб не путати з параметром
        // створено за допомогою Generate
    }

    public Fish(String color, int size, String name) {
        this.color = color;
        this.name = name;
        this.size = size;
    }

    public Fish(int size, String color, String name) {
        this.color = color;
        this.size = size;
        this.name = name;
    }
}
