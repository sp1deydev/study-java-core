package Concurrency.Lock.TryLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SafeResource {
    private final Lock lock = new ReentrantLock();

    public void safeAccess() {
        if (lock.tryLock()) { // Thử chiếm lock, nếu thành công thì tiếp tục
            try {
                System.out.println(Thread.currentThread().getName() + " đang truy cập tài nguyên.");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " không thể truy cập, tài nguyên đang bận.");
        }
    }
}

public class TryLock {
    public static void main(String[] args) {
        SafeResource resource = new SafeResource();

        Runnable task = () -> {
            for (int i = 0; i < 3; i++) {
                resource.safeAccess();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ignored) {}
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}

