package lesson.example.java.core.lesson18;

import lesson.example.java.core.lesson11.Person;

public class SimpleGenApp {

    public static void main(String[] args) {

        SimpleGen<String> ssg = new SimpleGen<>("Java is the best");
        ssg.showType();

        SimpleGen<Integer> isg = new SimpleGen<>(123456);
        isg.showType();

        SimpleGen osg = new SimpleGen(new Person("Karl"));
        osg.showType();

        TwiceSimpleGen<String, Double> tsw = new TwiceSimpleGen<>("Some string", 12345.123);
        tsw.showType();

        TwiceSimpleGen objectTwoSimpleGen = new TwiceSimpleGen(1234L, new Person("Marta"));
        objectTwoSimpleGen.showType();

        LimitedGen lgeneric = new LimitedGen(new Double[] {1.2, 2.6, 3.0});
        lgeneric.printFirst();
    }
}
