package lesson.example.basics.basics03;

public class MethodCall {

    public static void main(String[] args) {

        // call methods without return value  and without arguments
        sayHello();

        // call method with return value (double) and with 2 int arguments
        // store method result into variable
        double d = division(5,9);
        System.out.println("Result is " +  d);
    }

    static double division (int firstNumber, int b){
        return (double) firstNumber/b;
    }

    static void sayHello(){
        System.out.println("Hello!");
    }
}
