package lesson11Method3cuhisse;

public class Main {
    public static void main(String[] args) {
        Person person=new Person();
        person.name="Nihat";
        person.age=13;

        int a=10;

        Calc calc=new Calc();
        int b=calc.sum(a);
        System.out.println(a);
        System.out.println(b);

        System.out.println(person.age);

        calc.calcAge(person);
        System.out.println(person.age);

        Calc.staticMetod();


    }
}
