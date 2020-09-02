package homework.ihorpayensky.homeworks.homework22.task2;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;

class Main {
    public static void main(String[] args) {
        Function<Integer, String> coin = res -> res == 1 ? "eagle" : "tail";
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        while (true) {
            System.out.print("Roll is >> " + coin.apply(r.nextInt(2)));
            String s = scanner.nextLine();
            if (!s.isEmpty())
                System.exit(0);
        }
    }
}
