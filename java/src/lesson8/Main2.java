package lesson8;

public class Main2 {
    public static void main(String[] args) {
        User user=new User();
        user.name="Ibrahim";
        user.surname="Guliyev";
        user.age=25;
        System.out.println("Name: "+user.name);

        User user1=new User();
        user1.name="Elman";
        System.out.println("Name user1 "+user1.name);

        String name="Ibrahim";

        String name1="Nuray";
        int age=55;
        User user2=new User(name1,"ELiyeva",age);
        System.out.println("User2 name: "+user2.name);

        User user3 =new User("Kamran","Huseynov");
        System.out.println("User3 name: "+user3.name);


    }
}
