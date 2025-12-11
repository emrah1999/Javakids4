package lesson15modifikatorlar;

public class Main3 {
    public static void main(String[] args) {
        AdiClass.name="Hello";
        System.out.println(AdiClass.name);

        AdiClass adiClass=new AdiClass();
        AdiClass.name="World";

        AdiClass adiClass1=new AdiClass();
        AdiClass.name="Java";

        System.out.println(AdiClass.name);

        adiClass1.metod(6);

    }
}
