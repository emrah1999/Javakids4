package lesson33multithreading2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Bank bank =new Bank(1000D);

        BankThread[] bankThreads=new BankThread[1000];
        for (int i = 0; i < bankThreads.length; i++) {
            bankThreads[i]=new BankThread(bank);
        }
        for (BankThread thread:bankThreads){
            thread.start();
        }
        Thread.sleep(2000);
        System.out.println(bank.getBalance());
    }
}
