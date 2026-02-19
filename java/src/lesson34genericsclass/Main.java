package lesson34genericsclass;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Arif";


        AdiClass<String> adiClass = new AdiClass<>();
        adiClass.name = "Sevinc";


        AdiClass<Integer> adiClass2 = new AdiClass<>();
        adiClass2.name = 123;

        AdiClass<Double> adiClass3 = new AdiClass<>();
        adiClass3.name = 3.14;


        AdiClass<User> adiClass4 = new AdiClass<>();
        adiClass4.name = new User();

        AdiClass<String> adiClass5=new AdiClass<>("Nuray");

    }
}
