package lesson.example.java.core.lesson20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorApp {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new MyClass());
        executorService.execute(new MyClass());
        executorService.execute(new MyClass());
        executorService.execute(new MyClass());
        executorService.shutdown();
    }
}

class MyClass implements Runnable {

    @Override
    public void run() {
        System.out.println("Hi, folks!)");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Bye, folks)");
    }
}
