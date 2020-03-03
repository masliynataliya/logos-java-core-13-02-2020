package lesson.example.java.core.lesson05.static0;

public class Cat {

    private String name;
    private final String color;

    private static int catCount = initCatCount();
    private static final String DESCRIPTION = "Cat show";

    public static String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public static int getCatCount() {
        return catCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        catCount++;
        System.out.printf("Hi, new %s cat %s is born\n", color, name);
    }

    private static int initCatCount() {
        System.out.println("Cat Count inited");
        return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
            "name='" + name + '\'' +
            ", color='" + color + '\'' +
            '}';
    }

}
