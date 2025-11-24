package lesson10Method2cihisse;

public class Main3 {
    public static void main(String[] args) {
        Person person=new Person();
        person.setAge(24);
        person.setName("Jasmin");

        System.out.println(person.getAge());
        System.out.println(person.getName());

        Person person1=new Person("Alice",30);
        Person person2=new Person("Alice");
        Person person3=new Person(30);
    }
}
