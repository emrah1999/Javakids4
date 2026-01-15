package lesson24OOP5cihisse;

public class Main3 {
    public static void main(String[] args) {
        Eatable dog=new Eatable() {
            @Override
            public void eat() {
                System.out.println("dog is Eating...");
            }
        };
        dog.eat();

        Eatable cat=new Eatable() {
            @Override
            public void eat() {
                System.out.println("cat is Eating...");
            }
        };
        cat.eat();
    }
}
