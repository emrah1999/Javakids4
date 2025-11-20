package lesson9ClassPraticseMethod;

public class Computer {
    int id;
    String brand;
    String model;
    String color;

    public Computer(){
        System.out.println("Parametrsiz constructor is called");
    }
    public Computer(String model){
        System.out.println(model);
    }
    public Computer(String model,String color){
        System.out.println(model+" "+color);
    }

    void start(){
        System.out.println("Computer is starting...");
    }

}
