package lesson30Dates;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student("John","Doe",75);
        student1.getInfo();
        if(student1.isPassed()){
            System.out.println("Student has passed the exam.");
        }else{
            System.out.println("Student has not passed the exam.");
        }

        BankAccont account1=new BankAccont(student1.name,500.0);
        try{
            account1.withDraw(300.0);
        }catch (RuntimeException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(student1.name +" new balance "+account1.balance);





    }
}
