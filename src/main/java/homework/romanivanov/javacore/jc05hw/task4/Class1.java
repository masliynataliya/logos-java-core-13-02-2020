package homework.romanivanov.javacore.jc05hw.task4;

public class Class1 {
    String name;
    int x;
    int y;

    public Class1(String name){
       x = 1;
       y = 1;
    }
    public Class1(int y, int x){
        this("Name");
        this.y = y;
        this.x = x;
    }
    public Class1(String name, int x){
        this(3,4);
        this.name = name;
    }

}
