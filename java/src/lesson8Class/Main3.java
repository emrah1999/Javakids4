package lesson8Class;

public class Main3 {
    public static void main(String[] args) {
        Book book=new Book();
        book.name="Fobiya";
        book.price=25.5D;

        User person=new User();
        person.name="Emrah";
        person.surname="Eyyubov";
        person.age=27;

        User person2=new User();
        person2.name="Nihat";
        person2.surname="Hesenli";
        person2.age=14;

        User person1=new User();
        person1.name="Deniz";
        person1.surname="Memmedov";
        person1.age=13;

        person1.name="Akif";

        User person3=person1;
        System.out.println(person3.name);
    }
}
