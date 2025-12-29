package lesson20OOP1cihisse;

import lesson20OOP1cihisse.subpackage.Cashier;

public class Main2 {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.name="Ali";
        teacher.surname="Veli";

        Driver driver=new Driver();
        driver.address="ABC sokak No:5";
        driver.city="Istanbul";
        driver.age=5;

        Cashier cashier=new Cashier();
        cashier.name="Ayse";
        cashier.surname="Fatma";

        Person person=new Teacher();
        person.print();
        System.out.println(person.name);
    }
}
