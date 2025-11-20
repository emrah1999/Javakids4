package lesson8Class;

public class Main5 {
    public static void main(String[] args) {
        User user=new User();
        System.out.println("Age: "+user.age);
        System.out.println("name : "+user.name);
        System.out.println("surname: "+user.surname);
        User user2=new User();
        if(user==user2){
            System.out.println("Same");
        }else{
            System.out.println("Not same");
        }

    }
}
