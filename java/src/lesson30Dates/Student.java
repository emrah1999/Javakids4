package lesson30Dates;

public class Student {
    String name;
    String surname;
    Integer grade;

    BankAccont account;

    public Student(String name, String surname, Integer grade) {
        this.name = name;
        this.surname = surname;
        this.grade = grade;
    }
    public Boolean isPassed(){
        return this.grade >= 51;
    }
    public void getInfo(){
        System.out.println("Name: " + this.name + ", Surname: " + this.surname + ", Grade: " + this.grade);
    }
}
