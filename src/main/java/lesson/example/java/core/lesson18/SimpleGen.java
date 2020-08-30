package lesson.example.java.core.lesson18;

public class SimpleGen<T> {

    T objectT;

    public void setObjectT(T objectT) {
        this.objectT = objectT;
    }

    public SimpleGen(T objectT) {
        this.objectT = objectT;
    }

    public void showType() {
        System.out.println("Object Type is : " + objectT.getClass().getSimpleName());
        System.out.println("Object value is: " + objectT.toString());
        System.out.println();
    }
}
