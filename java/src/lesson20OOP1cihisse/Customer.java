package lesson20OOP1cihisse;

public class Customer {
    String name;
    Double balance;

    public Customer(String name, Double balance){
        this.name=name;
        this.balance=balance;
    }

    public void buyProduct(Product p,int quantity){
        Double totalPrice=p.price*quantity;
        if(this.balance>=totalPrice){
            this.balance-=totalPrice;
            System.out.println(this.name+" "+p.name+" aldi. Qalan balans: "+this.balance);
            System.out.println("Qalan pul: "+this.balance);
        }else{
            System.out.println("Balansda pul yoxdur");
        }
    }
}
