package lesson48DesignPattern;

public class Observer {
    private String name;

    public Observer(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + "-den yenui melumat var: " + message);
    }
}
