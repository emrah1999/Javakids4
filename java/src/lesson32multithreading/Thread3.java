package lesson32multithreading;

public class Thread3 implements Runnable{
    @Override
    public void run() {
        long sum=0;
        for (long i = 0; i < 9000000000L; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
