package lesson16Praktika;

public class ModifiersDemo {
    public static void main(String[] args) {
        Person person =new Person();
        Person person1=new Person("Jasmin","ssddd");
        person1.surname="Doe";

        Person.fin="Final Value";


        person1.getName();
        person1.metod1();


        School school=new School();
        school.setName("ABC School");
        school.setAddress("123 Main St");
        System.out.println(school.getName()+" "+school.getAddress());

        Calc calc=new Calc();
        System.out.println(calc.sum(1,2,3,4,5));
        System.out.println(calc.sum(1,4,5));
        System.out.println(calc.sum(1,4));
    }
}
