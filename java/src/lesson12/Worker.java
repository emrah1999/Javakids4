package lesson12;

public class Worker {
    String name;
    String surname;
    int age;
    double salary;
    public Worker(String name,String surname, int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    public void info(){
        System.out.println("Name: "+name+" surname: "+surname+" age: "+age+" salary: "+salary);
    }

}

