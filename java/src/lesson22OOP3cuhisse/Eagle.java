package lesson22OOP3cuhisse;

public class Eagle implements Eatable,Flyable {
    @Override
    public void eat(String food) {
        System.out.println("Eagle is eating " + food);
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

}
