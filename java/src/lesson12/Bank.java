package lesson12;

public class Bank {
    double balance;
    public Bank(double balance){
        this.balance = balance;
    }
    public void addBalance(double amount){
        System.out.println("Balansa "+amount+" elave olundu");
        balance+=amount;
    }

    public void subBalance(double amount){
        System.out.println(amount+" mebleg balansdan cixildi");
        if(amount>balance){
            System.out.println("Kifayet qeder mebleg yoxdur");
        }else{
            balance-=amount;
        }

    }
    public void printBalance(){
        System.out.println("Bank balansi : "+balance);
    }
}
