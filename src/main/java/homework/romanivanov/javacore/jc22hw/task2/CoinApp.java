package homework.romanivanov.javacore.jc22hw.task2;

public class CoinApp {
    public static void main(String[] args) {
        CoinFlipp coinFlipp = () -> {
            int z = (int) (Math.random() * 2);
            if (z == 1) {
                System.out.println("Решка");
            } else {
                System.out.println("Орел");
            }
        };
        coinFlipp.tossCoin();
    }
}
interface CoinFlipp {
    void tossCoin();
}


