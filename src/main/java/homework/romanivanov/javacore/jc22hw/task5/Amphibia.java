package homework.romanivanov.javacore.jc22hw.task5;

import java.util.function.Consumer;

public  class Amphibia   {
    Consumer<String> con = System.out::println;
    public  void move(){
        con.accept("move");
    }

    public  void eat(){
        con.accept("eat");

    }
    public  void swim(){
        con.accept("swim");

    }
    public  void chill(){
        con.accept("chill");

    }



}





