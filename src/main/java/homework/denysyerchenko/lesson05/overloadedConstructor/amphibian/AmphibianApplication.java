package homework.denysyerchenko.lesson05.overloadedConstructor.amphibian;

public class AmphibianApplication {
    public static void main(String[] args) {
        Frog frog = new Frog();

        frog.eat();
        frog.sleep();
        frog.swim();
        frog.walk();

        Amphibian frog1 = new Frog();

    }
}
