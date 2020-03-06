package homework.ihorpayensky.homeworks.homework05.task5;

class Main {
    public static void main(String[] args) {
        Frog frog = new Frog();

        method(frog);
    }

    private static void method(Amphibia amphibia) {
        amphibia.eat();
        amphibia.sleep();
        amphibia.swim();
        amphibia.walk();
    }

}
