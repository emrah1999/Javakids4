package lesson9ClassPraticseMethod;

public class ClassAndObjectAndConstructors {
    public static void main(String[] args) {
      Computer computer1=new Computer();
      computer1.id=2;
      computer1.brand="Apple";
      computer1.model="MacBook Pro";
      computer1.color="Silver";

      Computer computer2=new Computer("Dell");
        System.out.println("Computer id: "+computer2.id);
        System.out.println("Computer brand: "+computer2.brand);
        System.out.println("Computer model: "+computer2.model);
        System.out.println("Computer color: "+computer2.color);

      Computer computer3=new Computer("HP","Black");

      computer1.start();
    }
}
