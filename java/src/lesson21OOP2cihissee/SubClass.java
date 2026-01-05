package lesson21OOP2cihissee;

public class SubClass extends SuperClass {
    String surname;
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Surname "   +this.surname);
    }
}
