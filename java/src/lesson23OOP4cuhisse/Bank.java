package lesson23OOP4cuhisse;

public class Bank {
    public void login(User user){
        if(user instanceof Student){
            Student student= (Student) user;
        }

    }
}
