package Concurrency.Threads;

public class MultiThreads extends Thread {
    String name;
    public MultiThreads(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 1; i < 6; i++) {
            System.out.println("This code is running " + i + " from " + name);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
