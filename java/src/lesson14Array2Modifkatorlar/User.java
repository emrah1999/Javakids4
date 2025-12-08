package lesson14Array2Modifkatorlar;

public class User {
    public String name;
    String surname;
    protected  int age;
    private String address;

    public User(String name,String username,String address,int age){
        this.name=name;
        this.surname=username;
        this.address=address;
        this.age=age;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public String getAddress(){
        return  address;
    }

    private int sumAge(){
        return age+5;
    }

}
