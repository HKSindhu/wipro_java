package test1;

public class MyThreading implements Runnable {

    public static void main(String[] args) {
    	MyThreading mythreading = new MyThreading();

        Thread t1 = new Thread(mythreading, "Thread1");
        Thread t2 = new Thread(mythreading, "Thread2");
        Thread t3 = new Thread(mythreading, "Thread3");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.println(Thread.currentThread().getName() + ": " + i);
    }
}