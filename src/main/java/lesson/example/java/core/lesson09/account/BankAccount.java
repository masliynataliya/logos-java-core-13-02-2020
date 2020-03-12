package lesson.example.java.core.lesson09.account;

public class BankAccount {

    private double balance;
    private boolean isCredit;
    private String text;

    public BankAccount(double balance, boolean isCredit) {
        this.isCredit = isCredit;

        if (isCredit) {
            balance = 100;
        } else {
            balance = 0;
        }

        // balance = (isCredit) ? 100 : 0;
    }

    public void addMoney(double addings) {
        balance = balance + addings;
        System.out.printf("Thanks, you have added %s, your balance is %s\n", addings, balance);
    }

    public void withdrawal(double amountToWithdraw) throws NotEnoughMoneyException {
        if (amountToWithdraw > balance && isCredit == false) {
            throw new NotEnoughMoneyException();
        }
        balance = balance - amountToWithdraw;
        System.out.printf("Thanks, you have withdraw %s, your balance is %s\n", amountToWithdraw, balance);
    }

    public void transfer(double amount, BankAccount account) throws NotEnoughMoneyException {
        if (amount > balance && isCredit == false) {
            throw new NotEnoughMoneyException();
        }
        balance = balance - amount;
        System.out.printf("Thanks, you have transfered %s, your balance is %s\n", amount, balance);
    }


}
