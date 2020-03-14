package homework.romanivanov.javacore.jc09hw;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, MyException {
        Methods meth = new Methods();
        meth.divide(0.0,1.0);
        meth.sum(-3.4,-2.3);
        meth.multiply(34.0,0);
        meth.subtraction(0.0,0.0);



    }
}
