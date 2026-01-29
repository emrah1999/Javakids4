package lesson28Exception2;

public class Main4 {
    public static void main(String[] args) {
        Car car =new Car();
        try{
            car.setSpeed(-50);
            car.setModel("BMW");
            System.out.println("Car model: "+car.getModel()+" Speed: "+car.getSpeed());
        }
        catch (CarException e){
            System.out.println("Xeta bas verdi: "+e.getMessage());
        }

    }
}
