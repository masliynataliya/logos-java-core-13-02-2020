package lesson.example.java.core.lesson09.exceptions;

public class LogosNotFoundException extends RuntimeException {

    LogosNotFoundException(String message) {
        super(message);
    }
}
