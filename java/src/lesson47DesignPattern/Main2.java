package lesson47DesignPattern;

public class Main2 {
    public static void main(String[] args) {
        Animal animal=AnimalFactory.createAnimal("cat");
        animal.sound();
    }
}
