package lesson.example.java.core.lesson17;

import static lesson.example.java.core.lesson17.EncloseClass.Nested.innerA;

public class EncloseClass {

    private String name;
    private static int a;

    static class Nested {

        private String innerName;
        public static int innerA;

        // ми "бачимо" приватну змінну зовнішнього класу в внутрішньому
        public void printHello() {
            System.out.println("Hello " + a);
        }
    }

    public void printBigHello() {
        // ми НЕ "бачимо" приватну змінну внутрішнього класу в зовнішньому - тільки package, package-private, public
        System.out.println("HELLO " + innerA);
    }
}
