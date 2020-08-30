package homework.romanivanov.javacore.jc22hw.task4;

import java.util.function.Function;

public class Class1 {

    String name;
    String color;
    int x;
    int y;
    public Class1(int x, int y){
       this.x = x;
       this.y = y;
    }
    public Class1(int x, int y, String name){
        this(x, y);
        this.name = name;
    }
    public Class1(String name, String color, int x, int y){
        this(x, y, name);
        this.color = color;
    }
    //Не маю жодної уяви як можна застосувати this в лямбда виразі

}



