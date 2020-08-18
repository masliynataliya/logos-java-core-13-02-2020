package lesson.example.java.core.lesson20;

public class SyncApp {

    static int num = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread thread0 = new Thread(new Worker());
        thread0.start();

        Thread thread1 = new Thread(new Worker());
        thread1.start();

        Thread thread2 = new Thread(new Worker());
        thread2.start();

        thread0.join();
        thread1.join();
        thread2.join();

        System.out.println(num);
    }

    public static synchronized void incrementNum() {
        num++;
    }


    static class Worker implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 2000; i++) {
                incrementNum();
            }
        }
    }
}
