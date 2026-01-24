package lesson27Praktika;

public class Person {
    String name;
    String surname;
    public Person(){
        System.out.println("Person created");
    }

    public Person(String n){
        this.name=n;
    }

    public Person(String surname,String a){
      this.surname=surname;
      this.name=a;
    }
}
