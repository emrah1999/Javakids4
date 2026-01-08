package lesson22OOP3cuhisse;

public class Fish implements Swimable,Eatable{

    @Override
    public void eat(String food) {
        System.out.println("Fish is eating "+ food);
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
