package lesson32multithreading;

public class Main3 {
    public static void main(String[] args) {
        Thread4 thread4 = new Thread4();
        Thread5 thread5 = new Thread5();
        thread5.setPriority(Thread.MIN_PRIORITY);
        thread4.setPriority(Thread.MAX_PRIORITY);
        thread4.start();
        thread5.start();
    }
}
