package lesson30Dates;

public class BankAccont {
    String owner;
    Double balance;

    public BankAccont(String owner, Double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void withDraw(Double amount) throws RuntimeException{
        if(amount>this.balance){
            throw new RuntimeException("Balans kifayet qeder deyil");
        }else{
            this.balance-=amount;
            System.out.println("Withdrawn amount: " + amount);
        }
    }
}
