package homework.ihorpayensky.homeworks.homework05.task2;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Coin {
    private final String head = "Head";
    private final String tail = "Tail";

    public String getHead() { return head; }
    public String getTail() { return tail; }

    public boolean tossingCoin() {
        Random r = new Random();
        List<String> temp = new ArrayList<String>();
        temp.add(this.head);
        temp.add(this.tail);
        var lack = temp.get(r.nextInt( 2));

        if (lack.equals("Head"))
            return true;
        else return false;
    }

    public void tossTheCoin() throws InterruptedException {
        System.out.println("Bard: Try to toss the coin, Witcher, heads or tails, but you know I like head.");
        Thread.sleep(2000);
        System.out.println("Witcher: Hmm, all right...");
        Thread.sleep(2000);
        System.out.println(" | The Witcher is tossing the coin");
        Thread.sleep(2000);
        System.out.println(" | Coin in the air");
        Thread.sleep(5000);
        if (tossingCoin()) {
            System.out.println(" | | | TAIL | | |");
            System.out.println(" | Luck in the Witcher side.");
            Thread.sleep(2000);
            System.out.println("Bard: Witcher, you`re lucky ass.");
        }
        else {
            System.out.println(" | | | HEAD | | |");
            System.out.println(" | Luck in the Bard side.");
            Thread.sleep(2000);
            System.out.println("Witcher: f*ck...");
        }
        Thread.sleep(1000);
    }
}
