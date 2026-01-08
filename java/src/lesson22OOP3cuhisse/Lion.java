package lesson22OOP3cuhisse;

public class Lion implements Runnable,Eatable {
    @Override
    public void eat(String food) {
        System.out.println("Lion is eating"+ food);
    }


    @Override
    public void run() {
        System.out.println("Lion is running");
    }
}
