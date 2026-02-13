package lesson32multithreading;

public class MyThread2 extends Thread {
    @Override
    public void run(){
        System.out.println("Start thread ");
        long sum=0;
        for (long i = 0; i < 10;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
        System.out.println(sum);
    }
}
