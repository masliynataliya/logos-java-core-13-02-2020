package lesson.example.java.core.lesson20;

public class ThreadExampleApp {
    public static void main(String[] args) {
        Thread myThread = new MyThread("NewJavaThread", 3000);
        myThread.start();

        System.out.println();

        Runnable myRunnable = new MyRunnable("myJava20Runnable");
        Thread thread = new Thread(myRunnable);
        thread.start();

        System.out.println();

        new MyRunnableWithBlackJack("Jack");
    }
}

class MyRunnableWithBlackJack implements Runnable {
    private String name;
    private Thread thread;

    public MyRunnableWithBlackJack(String name) {
        this.name = name;
        thread = new Thread();
        System.out.println("Let BlackJack begin");
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("BlackJack : " + name + " - " + i);
        }
    }
}

class MyRunnable implements Runnable {

    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runnable : " + name + " - " + i);
        }
    }
}


class MyThread extends Thread {

    private String name;
    private int delay;

    public MyThread(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }

    @Override
    public synchronized void start() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Name : " + name + " - " + i);
        }
        try {
            Thread.sleep(delay);
            System.out.println("Bye!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
