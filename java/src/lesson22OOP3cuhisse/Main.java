package lesson22OOP3cuhisse;

public class Main {
    public static void main(String[] args) {
        Lion lion=new Lion();
        lion.eat("meat");
        lion.run();

        Fish fish=new Fish();
        fish.eat("flakes");
        fish.swim();

        Eagle eagle=new Eagle();
        eagle.eat("small animals");
        eagle.fly();
    }
}
