package lesson.example.java.core.lesson09.account;

public class BankApp {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000, false);
        try {
            account.addMoney(150);
            account.withdrawal(2000);
            account.transfer(100, new BankAccount(0, true));
        } catch (Exception e) {
            System.out.println("Sorry. " + e.getMessage());
        }
    }
}
