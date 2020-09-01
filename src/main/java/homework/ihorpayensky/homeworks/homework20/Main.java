package homework.ihorpayensky.homeworks.homework20;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Main {
    public static void main(String[] args) throws InterruptedException, IOException {


        System.out.print("Enter k >> ");
        int k = new Scanner(System.in).nextInt();
        System.out.println();

        MyThread myThread = new MyThread(k);
        Runnable myRunnable = new Runnable(k);

        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myRunnable);

        thread1.start();
        thread2.start();


        /*

        вивід в два рядки не можливий ((
        зробив по можливості адекватно

         */

        System.out.println("Something else");

        ExecutorService executor1 = Executors.newSingleThreadExecutor();
        ExecutorService executor2 = Executors.newFixedThreadPool(4);
        ExecutorService executor3 = Executors.newCachedThreadPool();
        ExecutorService executor4 = Executors.newScheduledThreadPool(4);

        executor1.execute(myThread);
        executor2.execute(myThread);
        executor3.execute(myThread);
        executor4.execute(myThread);

        executor1.shutdown();
        executor2.shutdown();
        executor3.shutdown();
        executor4.shutdown();

    }

}
