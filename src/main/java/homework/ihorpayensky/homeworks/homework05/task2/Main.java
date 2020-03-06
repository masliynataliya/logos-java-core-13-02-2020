package homework.ihorpayensky.homeworks.homework05.task2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sn = new Scanner(System.in);
        Coin coin = new Coin();
        String string;

        do {
            System.out.println();
            coin.tossTheCoin();
            System.out.println(" ========================================================= ");
            System.out.println(" ===== press the enter to try again or `stop` to end ===== ");
            System.out.println(" ========================================================= ");
            string = sn.nextLine();
        } while (!string.equals("stop"));

    }
}
