package homework.romanivanov.javacore.jc20hw.thread;

import java.util.*;

import static homework.romanivanov.javacore.jc20hw.thread.Fibonachi.getNumbers;

public class ThreadExample {
    public static void main(String[] args) {
        RunnableThread runnableThread = new RunnableThread();
        runnableThread.run();
        MyThread myThread = new MyThread();
        myThread.run();
    }

}

class MyThread extends Thread {
    private Scanner sc = new Scanner(System.in);
    @Override
    public synchronized void run() {
        System.out.println("Введіть скільки чисел ви хочете фібаночі переглянути");
        int size = sc.nextInt();
        List<Integer> fibonachi = getNumbers(size);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(fibonachi.toString());
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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(fibonochiBack.toString());
    }
}
