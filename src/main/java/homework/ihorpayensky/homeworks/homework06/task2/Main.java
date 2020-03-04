package homework.ihorpayensky.homeworks.homework06.task2;

public class Main {
    public static void main(String[] args) {

        MyCalculator m = new MyCalculator(40, 2);

        System.out.printf( "adding\t\t| %s\n", m.add() );
        System.out.printf( "subtracting\t| %s\n", m.subtract() );
        System.out.printf( "dividing\t| %s\n", m.divide() );
        System.out.printf( "multiplying\t| %s\n", m.multiply() );

    }
}
