package lesson22OOP3cuhisse;

public class Main2 {
    public static void main(String[] args) {
        Restoran restoran =new Restoran();
        Lion lion=new Lion();
        Eagle eagle=new Eagle();

        Eatable eatable= new Fish();

        Cat cat=new Cat();

        restoran.eat(cat,"fish");

        restoran.eat(lion,"meat");

        restoran.eat(eagle,"small animals");
    }
}
