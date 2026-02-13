package lesson32multithreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start code");
        MyThread myThread=new MyThread();
        myThread.start();

        MyThread2 myThread2=new MyThread2();
        myThread2.start();

        Thread thread3=new Thread(new Thread3());
        thread3.start();
        System.out.println("Finish code");
    }
}
