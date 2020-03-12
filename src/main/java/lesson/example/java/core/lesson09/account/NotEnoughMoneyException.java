package lesson.example.java.core.lesson09.account;

import java.rmi.server.ExportException;

public class NotEnoughMoneyException extends Exception {

    NotEnoughMoneyException() {
        super("You have not enough money for this operation");
    }
}
