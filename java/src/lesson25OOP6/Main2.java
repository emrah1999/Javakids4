package lesson25OOP6;

public class Main2 {
    public static void main(String[] args) {
        Cookable ashbaz =new Cookable() {
            @Override
            public void cook(String name) {
                System.out.println("Cooking "+name);
            }
        };
        ashbaz.cook("plov");
    }
}
