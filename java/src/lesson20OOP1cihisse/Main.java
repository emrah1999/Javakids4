package lesson20OOP1cihisse;

public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer("Ibrahim",20D);
        Product product=new Product("Laptop",10D);
        customer.buyProduct(product,1);

        Counter counter=new Counter();
        Counter counter1=new Counter();
        Counter counter2=new Counter();
        Counter counter3=new Counter();

    }
}
