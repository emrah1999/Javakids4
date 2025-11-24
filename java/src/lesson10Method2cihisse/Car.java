package lesson10Method2cihisse;

public class Car {
    public void start(){
        System.out.println("Car is starting");
    }
    public int getSpeed(){
        return 100;
    }
    public String getModel(){
        return "Toyota";
    }
    public Car getCar(){
        Car car=new Car();
        return car;
    }
}
