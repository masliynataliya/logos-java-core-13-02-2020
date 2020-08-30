package lesson.example.java.core.lesson18;

public class LimitedGen<T extends Number> {

    T[] numArray;

    public void printFirst() {
        System.out.println(numArray[0].getClass().getSimpleName() + " " + numArray[0]);
    }

    public LimitedGen(T[] numArray) {
        this.numArray = numArray;
    }
}
