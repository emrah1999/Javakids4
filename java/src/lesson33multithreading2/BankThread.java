package lesson33multithreading2;

public class BankThread extends Thread {
    Bank bank;

    public BankThread(Bank bank){
        this.bank=bank;
    }
    @Override
    public void run() {
        bank.withDraw2(1D);
    }
}
