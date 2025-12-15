package lesson16Praktika;

public class Person {
    private String name;
    protected String surname;
    public int age;
    String address;

    public String getName(){
        return name;
    }
    protected void metod1(){

    }
    private void metod2(){

    }
    int getAge(int age){
        return age;
    }
    public void addres(Address asd){

    }

    public Address getAd(){
        Address address1=new Address();
        return address1;
    }

    Person(String name,String surname){
        this.name=name;
        this.surname=surname;
    }
    public Person(){

    }
    protected Person(int age,String address){

        this.age=age;
        this.address=address;
    }
    private Person(String address){
        this.address=address;
    }

    public void finalMetod(final String name){
        this.name=name;
    }
    public static String fin;
}
