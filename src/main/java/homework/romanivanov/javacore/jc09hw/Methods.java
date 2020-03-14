package homework.romanivanov.javacore.jc09hw;

public class Methods {
    public void sum(double a, double b){
        if (a<0.0 && b < 0.0) {
            throw new IllegalArgumentException();
        }
            double sum = a + b;
            System.out.println(sum);
        }


    public void divide(double a, double b) throws MyException, IllegalAccessException {
//        myException(a, b);
        if (a==0.0 && b!= 0.0){
            throw new ArithmeticException();
        }

        double divide = a/b;
        System.out.println(divide);
    }
    public void multiply(double a, double b) throws MyException, IllegalAccessException {
//        myException(a, b);
        if (a!=0.0 && b==0.0){
            throw new ArithmeticException();
        }
        if (a>0 &&  b>0) {
            throw new MyException();
        }


        double multiply = a*b;
        System.out.println(multiply);
    }

    public void subtraction(double a, double b) throws  IllegalAccessException {
        if (a==0.0 && b==0.0) {
            throw new IllegalAccessException();
        }
//        myException(a, b);
        double subtraction = a - b;
        System.out.println(subtraction);
    }


//    public void myException(double a, double b) throws IllegalAccessException, MyException {
//        if (a<0 && b < 0) {
//            throw new IllegalArgumentException();
//        }
//        if (a==0 && b!= 0){
//            throw new ArithmeticException();
//        }
//        if (a!=0 && b==0){
//            throw new ArithmeticException();
//        }
//        if (a==0 && b==0){
//            throw new IllegalAccessException();
//        }
//        if (a>0 &&  b>0){
//            throw new MyException();
//        }
    }

