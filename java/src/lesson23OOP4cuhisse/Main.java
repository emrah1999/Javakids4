package lesson23OOP4cuhisse;

public class Main {
    public static void main(String[] args) {
        User student=new Student();
        User driver=new Driver();
        User driver2=new Driver();

        Bank bank=new Bank();
        bank.login(student);
        bank.login(driver);

        Car car1=new Car("BMW","250");
        Car car2=new Car("BMW","250");
        if(car1.equals(car2)){
            System.out.println("beraberdir");
        }else{
            System.out.println("beraber deyil");
        }
    }
}
