package Concurrency.DeadLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class DeadlockExample {
    private static final Lock lock1 = new ReentrantLock();
    private static final Lock lock2 = new ReentrantLock();

    static class Task1 implements Runnable {
        public void run() {
            lock1.lock(); // Chiếm lock1
            System.out.println(Thread.currentThread().getName() + " đã khóa lock1");

            try {
                Thread.sleep(100); // Giả lập thời gian xử lý
                lock2.lock(); // Cố gắng chiếm lock2
                System.out.println(Thread.currentThread().getName() + " đã khóa lock2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock2.unlock();
                lock1.unlock();
                System.out.println(Thread.currentThread().getName() + " đã giải phóng lock1 và lock2");
            }
        }
    }

    static class Task2 implements Runnable {
        public void run() {
            lock2.lock(); // Chiếm lock2
            System.out.println(Thread.currentThread().getName() + " đã khóa lock2");

            try {
                Thread.sleep(100); // Giả lập thời gian xử lý
                lock1.lock(); // Cố gắng chiếm lock1
                System.out.println(Thread.currentThread().getName() + " đã khóa lock1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock1.unlock();
                lock2.unlock();
                System.out.println(Thread.currentThread().getName() + " đã giải phóng lock2 và lock1");
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

