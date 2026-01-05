package lesson21OOP2cihissee;

public class Car {
    String name;
    String color;
    String model;
    Double price;

    public Car(String name, String color, String model,Double price){
        this.name=name;
        this.color=color;
        this.model=model;
        this.price=price;
    }


    public Car(String name, String model){
        this.name=name;
        this.model=model;
    }
    public Car(String name,Double price){
        this.name=name;
        this.price=price;
    }
    public Car(String name,String color,Double price){
        this.name=name;
        this.color=color;
        this.price=price;
    }
}
