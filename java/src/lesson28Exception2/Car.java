package lesson28Exception2;

public class Car {
    private String model;
    private Integer speed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) throws CarException{
        if(speed<0){
            throw  new CarException("Suert 0dan az ola bilmez");
        }
        this.speed = speed;
    }
}
