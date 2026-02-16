package lesson33multithreading2;

public class Bank {
    private Double balance;
    private final Object lock=new Object();
    private final Object lock1=new Object();
    private final Object lock2=new Object();
    public Bank(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public synchronized void withDraw(Double amount){
        this.balance-=amount;
    }

    public  void withDraw4(Double amount){
        synchronized (lock1){
            this.balance-=amount;
        }
    }

    public  void withDraw3(Double amount){
        synchronized (lock2){
            this.balance-=amount;
        }

    }
    public  void withDraw5(Double amount){
        synchronized (lock2){
            this.balance-=amount;
        }

    }
    public void withDraw2(Double amount){
        synchronized (lock){
            this.balance-=amount;
        }

    }

}
