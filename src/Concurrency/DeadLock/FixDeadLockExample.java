package Concurrency.DeadLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

class TryLockExample {
    private static final Lock lock1 = new ReentrantLock();
    private static final Lock lock2 = new ReentrantLock();

    static class Task1 implements Runnable {
        public void run() {
            try {
                if (lock1.tryLock(500, TimeUnit.MILLISECONDS)) { // Thử chiếm lock1 trong 500ms
                    System.out.println(Thread.currentThread().getName() + " đã khóa lock1");

                    Thread.sleep(100);

                    if (lock2.tryLock(500, TimeUnit.MILLISECONDS)) { // Thử chiếm lock2 trong 500ms
                        try {
                            System.out.println(Thread.currentThread().getName() + " đã khóa lock2");
                        } finally {
                            lock2.unlock();
                        }
                    } else {
                        System.out.println(Thread.currentThread().getName() + " không thể khóa lock2, giải phóng lock1");
                    }
                    lock1.unlock();
                } else {
                    System.out.println(Thread.currentThread().getName() + " không thể khóa lock1");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Task2 implements Runnable {
        public void run() {
            try {
                if (lock2.tryLock(500, TimeUnit.MILLISECONDS)) { // Thử chiếm lock2 trong 500ms
                    System.out.println(Thread.currentThread().getName() + " đã khóa lock2");

                    Thread.sleep(100);

                    if (lock1.tryLock(500, TimeUnit.MILLISECONDS)) { // Thử chiếm lock1 trong 500ms
                        try {
                            System.out.println(Thread.currentThread().getName() + " đã khóa lock1");
                        } finally {
                            lock1.unlock();
                        }
                    } else {
                        System.out.println(Thread.currentThread().getName() + " không thể khóa lock1, giải phóng lock2");
                    }
                    lock2.unlock();
                } else {
                    System.out.println(Thread.currentThread().getName() + " không thể khóa lock2");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Task1(), "Thread-1");
        Thread t2 = new Thread(new Task2(), "Thread-2");

        t1.start();
        t2.start();
    }
}
