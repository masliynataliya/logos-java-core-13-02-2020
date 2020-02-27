package homework.pavliuk;

public class Hors {
    public static void main(String[] args) {

        Horse h1 = new Horse(1.5);
        h1.run();
        h1.speak();

        System.out.println();

        Horse1 h2 =new Horse1(2.5,4.3);
        h2.fly();
        h2.run();
        h2.speak();
        System.out.println(h2.getColor());
    }

}
