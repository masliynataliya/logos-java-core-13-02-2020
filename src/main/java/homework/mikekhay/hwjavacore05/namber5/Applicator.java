package homework.mikekhay.hwjavacore05.namber5;

import org.w3c.dom.ls.LSOutput;

public class Applicator {
    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println(frog.eats());
        System.out.println(frog.sleep());
        System.out.println(frog.swimming());
        System.out.println(frog.walk());
    }
}
