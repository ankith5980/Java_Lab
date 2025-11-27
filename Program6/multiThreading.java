// Implement the concept of multithreading. 

package Program6;

public class multiThreading {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        // 1. Using Thread class
        MyThread thread1 = new MyThread();
        thread1.start();

        // 2. Using Runnable interface
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();

        System.out.println("Main thread ending.");
    }
}

// Extending Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyThread: " + i);
            try {
                Thread.sleep(500); // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyRunnable: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
