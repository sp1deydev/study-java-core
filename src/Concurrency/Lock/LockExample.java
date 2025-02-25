package Concurrency.Lock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private int count = 0;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock(); // Chiếm lock
        try {
            count++;
            System.out.println(Thread.currentThread().getName() + " tăng count lên: " + count);
        } finally {
            lock.unlock(); // Giải phóng lock
        }
    }
}

public class LockExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                resource.increment();
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}

