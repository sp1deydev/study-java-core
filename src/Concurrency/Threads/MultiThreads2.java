package Concurrency.Threads;

public class MultiThreads2 implements Runnable{
    String name;
    public MultiThreads2(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for(int i = 1; i < 6; i++) {
            System.out.println("This code is running " + i + " from " + name);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
