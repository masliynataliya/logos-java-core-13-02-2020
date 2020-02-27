package lesson.example.java.core.lesson03;

public class Animal {

    private String type;
    private String name;
    private String color;
    private int age;

    public String getType() {
        return type;
    }

    public void setType(String newType) {
        type = newType;
    }

    @Override
    public String toString(){
        return "Animal[Type = " + type + "; Name = " + name + "; Color = " + color + "; Age = " + age + "]";
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
        type = "unknown";
        name = "dou";
        age = 0;
        color = "gray";
    }

    public Animal(String initType) {
        type = initType;
    }

    public Animal(String initType, String initName) {
        type = initType;
        name = initName;
    }

    public Animal(String initType, String initName, String initColor) {
        type = initType;
        name = initName;
        color = initColor;
    }

    public Animal(int initAge, String initType, String initName, String initColor) {
        type = initType;
        name = initName;
        color = initColor;
        age = initAge;
    }

    public Animal(String initType, int initAge, String initName, String initColor) {
        type = initType;
        name = initName;
        color = initColor;
        age = initAge;
    }

    public Animal(String initType, String initName, int initAge, String initColor) {
        type = initType;
        name = initName;
        color = initColor;
        age = initAge;
    }

}
