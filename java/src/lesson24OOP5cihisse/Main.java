package lesson24OOP5cihisse;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1=new User("Nihat","Hesenov");
        User user2=new User("Nihat","Hesenov");
        if(user1.equals(user2)){
            System.out.println("Eynidir ");
        }else{
            System.out.println("Ferqlidi ");
        }
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

        user2=null;
        System.gc();

        User user3=new User("Test","User");
        User user4= (User) user3.clone();

        user3.name="Changed Name";
        System.out.println(user4.name);
        System.out.println(user3.name);

        user4.name="dsd";
        System.out.println(user4.name);
        System.out.println(user3.name);
    }
}
