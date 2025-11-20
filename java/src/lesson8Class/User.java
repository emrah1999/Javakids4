package lesson8Class;

public class User {
    String name;
    String surname;
    int age;

    public User(){
        System.out.println("Parametrsiz constructor is called");
    }

    public User(String n,String s,int a){
        System.out.println("Parametrli Constructor is called");
        name=n;
        surname=s;
        age=a;
    }

    public User(String n,String s){
        name=n;
        surname=s;
    }

    public User(double d){
        age=(int)d;
    }


}
