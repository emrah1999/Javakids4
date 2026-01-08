package lesson22OOP3cuhisse;

public class Cat implements Runnable,Eatable {
    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    @Override
    public void eat(String food) {
        System.out.println("Cat is eating " + food);
    }
}
