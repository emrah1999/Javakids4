package lesson42mySql;

public class Computer {
    String model;
    Integer storage;

    public Computer(String model, Integer storage) {
        this.model = model;
        this.storage = storage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }
}
