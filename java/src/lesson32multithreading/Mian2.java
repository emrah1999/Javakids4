package lesson32multithreading;

public class Mian2 {
    public static void main(String[] args) throws InterruptedException {
//
        System.out.println("Start");
        MyThread2 myThread1 = new MyThread2();
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
        myThread2.join();
        myThread1.start();
        System.out.println("finish");
    }
}
