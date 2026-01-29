package lesson28Exception2;

public class Main {
    public static void main(String[] args) {
        Character health=new Character(-20D);
        health.setHealth(-5D);
        System.out.println(health.getHealth());
    }
}
