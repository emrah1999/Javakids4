package lesson12;

public class Main2 {
    public static void main(String[] args) {
        Bank bank=new Bank(1000);
        bank.printBalance();
        bank.addBalance(400);
        bank.subBalance(500);
        bank.printBalance();

        bank.subBalance(1000);
    }
}
