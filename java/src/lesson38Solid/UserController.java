package lesson38Solid;

public class UserController {
    public void addUser(){
        UserAddService userAddService = new UserAddService();
        userAddService.addUser();
        // add user to database
    }
}
