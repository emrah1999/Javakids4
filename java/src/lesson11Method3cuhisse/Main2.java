package lesson11Method3cuhisse;

public class Main2 {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="Sevin";
        student.surname="Kerimli";
        student.address=new Address();
        student.address.city="Baku";

        Address address=new Address();
        address.city="Gence";
        address.street="Nizami street";

        Student student1=new Student();
        student1.address=address;
    }
}
