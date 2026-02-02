package lesson29;

public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer();
        try {
            customer.setName("");
        }catch (InvalidUserInputException e){
            System.out.println("Exception caught: "+e.getMessage());
        }

        Person person=new Person("hn","De");
        System.out.println(person.getName());
        System.out.println(person.getSurname());


    }
}
