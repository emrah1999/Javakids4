package lesson20OOP1cihisse;

public class Person {
    protected String name;
    public String surname;
    Integer age;
    String address;
    String city;

    public Person() {

    }

    public void print(){
        System.out.println("ust sinif");
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

}
