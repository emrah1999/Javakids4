package lesson21OOP2cihissee;

public class BMW extends Car{
    public BMW(String name, String color, String model,Double price){
        super(name, color, model,price);
    }

    public BMW(String name, String model){
        super(name, model);
    }
    public BMW(String name,Double price){
        super(name, price);
    }
    public BMW(String name,String color,Double price){
        super(name, color, price);
    }
}
