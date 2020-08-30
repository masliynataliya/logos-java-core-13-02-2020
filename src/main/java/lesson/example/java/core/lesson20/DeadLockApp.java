package lesson.example.java.core.lesson20;

public class DeadLockApp {

    public static void main(String[] args) {
        Resource1 resource1 = new Resource1();
        Resource2 resource2 = new Resource2();

        resource1.setResource2(resource2);
        resource2.setResource1(resource1);

        Thread1 thread1 = new Thread1();
        thread1.setResource1(resource1);

        Thread2 thread2 = new Thread2();
        thread2.setResource2(resource2);

        thread1.start();
        thread2.start();

    }
}



class Thread1 extends Thread {

    Resource1 resource1;

    public void setResource1(Resource1 resource1) {
        this.resource1 = resource1;
    }

    @Override
    public synchronized void run() {
        System.out.println(resource1.returnNum());
    }
}

class Thread2 extends Thread {

    Resource2 resource2;

    public void setResource2(Resource2 resource2) {
        this.resource2 = resource2;
    }

    @Override
    public synchronized void run() {
        System.out.println(resource2.returnNum());
    }
}

class Resource1 {

    Resource2 resource2;

    public void setResource2(Resource2 resource2) {
        this.resource2 = resource2;
    }

    public synchronized int returnNum() {
        return 1;
    }

    public synchronized int getNum() {
        return resource2.getNum();
    }

}

class Resource2 {
    public void setResource1(Resource1 resource1) {
        this.resource1 = resource1;
    }

    Resource1 resource1;

    public synchronized int returnNum() {
        return 2;
    }

    public  synchronized int getNum() {
        return resource1.getNum();
    }
}