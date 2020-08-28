package homework.romanivanov.javacore.jc20hw.executor;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static homework.romanivanov.javacore.jc20hw.thread.Fibonachi.getNumbers;

public class ExecutorApp {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        executorService.execute(new MyThread());
        executorService.execute(new RunnableThread());
        executorService.shutdown();

    }

}
class RunnableThread implements Runnable {
    private final Scanner sc = new Scanner(System.in);

    @Override
    public void run() {
        System.out.println("Введіть скільки ви хочете побачити чисел фібаночі у зворотньому порядку");
        int size = sc.nextInt();
        List<Integer> fibonochiBack = getNumbers(size);
        Collections.reverse(fibonochiBack);
        for (int i = 0; i < fibonochiBack.size(); i++) {
            try {
                Thread.sleep(1000);
                System.out.println(fibonochiBack.get(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class MyThread extends Thread {
    private final Scanner sc = new Scanner(System.in);

    @Override
    public synchronized void run() {
        System.out.println("Введіть скільки чисел ви хочете фібаночі переглянути");
        int size = sc.nextInt();
        List<Integer> fibonachi = getNumbers(size);
        for (int i = 0; i < fibonachi.size(); i++) {
            try {
                Thread.sleep(1000);
                System.out.println(fibonachi.get(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
