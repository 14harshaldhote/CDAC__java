/*
DAEDLOCK - if multiple thread have lock on its corresponding resources and waiting for releasing other thread lock on its resources
            so that they cn use it but if there is a condition if all thread waiting for each other simultanesously to realese there lock 
            in that situation deadlock purpose is arrived







*/




package thread;


public class deadlockThread {
    public static Object resource1 = new Object();
    public static Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Holding resource 1...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                System.out.println("Thread 1: Waiting for resource 2...");
                synchronized (resource2) {
                    System.out.println("Thread 1: Acquired resource 2!");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Holding resource 2...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                System.out.println("Thread 2: Waiting for resource 1...");
                synchronized (resource1) {
                    System.out.println("Thread 2: Acquired resource 1!");
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(20000);
            System.out.println("Exiting after 20000 milliseconds.");
            thread1.interrupt();
            thread2.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
