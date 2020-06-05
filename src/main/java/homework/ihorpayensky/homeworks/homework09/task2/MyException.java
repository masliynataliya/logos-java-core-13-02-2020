package homework.ihorpayensky.homeworks.homework09.task2;

class MyException extends Exception {
    MyException(String s) {
        super("Nice job! " + s);
    }
}
