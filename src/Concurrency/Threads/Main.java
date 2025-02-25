package Concurrency.Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MultiThreads m1 = new MultiThreads("thread 1");
        MultiThreads2 m2 = new MultiThreads2("thread 2");
        Thread obj2 = new Thread(m2);
//        for(int i = 0; i < 3; i++) {
//            MultiThreads m1 = new MultiThreads();
//            m1.start();
//        }
        m1.start();
        m1.join(4000);
        System.out.println(m1.isAlive());
        obj2.start();
    }
}
