package lesson.example.java.core.lesson18;

public class TwiceSimpleGen<A, B> {

    private A aaaa;
    private B bbbb;

    public TwiceSimpleGen(A aaaa, B bbbb) {
        this.aaaa = aaaa;
        this.bbbb = bbbb;
    }

    public void showType() {
        System.out.println("A type is : " + aaaa.getClass().getSimpleName() + ", value is : " + aaaa.toString());
        System.out.println("B type is : " + bbbb.getClass().getSimpleName() + ", value is : " + bbbb.toString());
        System.out.println();
    }
}
