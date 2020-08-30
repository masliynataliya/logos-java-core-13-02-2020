package homework.romanivanov.javacore.jc20hw.thread;

import java.util.*;

import static homework.romanivanov.javacore.jc20hw.thread.Fibonachi.getNumbers;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        RunnableThread runnableThread = new RunnableThread();
        Thread thread = new Thread(runnableThread);
        thread.start();
        thread.join();
        MyThread myThread = new MyThread();
        myThread.start();
    }

}

class MyThread extends Thread {
    private Scanner sc = new Scanner(System.in);
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

class RunnableThread implements Runnable {
    private Scanner sc = new Scanner(System.in);

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
