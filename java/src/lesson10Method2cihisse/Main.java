package lesson10Method2cihisse;

public class Main {
    public static void main(String[] args) {
        Developer developer=new Developer();
        developer.name="Deniz";
        developer.surname="Doe";
        developer.age=30;

        System.out.println("Developer 1 "+developer.name+" "+developer.surname+" "+developer.age);

        Developer developer2=new Developer();
        developer2.name="Arif";
        developer2.surname="Smith";
        developer2.age=25;

        Computer computer=new Computer("Dell","Black");

        Calculation calculation=new Calculation();
        calculation.sum(10,4);
        calculation.sub(45,33);
        calculation.multiply(7,9);
//        int a=5.4F;
    }
}
