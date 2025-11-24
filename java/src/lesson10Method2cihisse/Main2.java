package lesson10Method2cihisse;

public class Main2 {
    public static void main(String[] args) {
        Car car=new Car();
        car.start();

        System.out.println(car.getModel());
        String model=car.getModel();
        System.out.println(model);
        int  speed=car.getSpeed();
    }
}
