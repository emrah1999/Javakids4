package lesson14Array2Modifkatorlar.package2;

import lesson14Array2Modifkatorlar.Calculator;
import lesson14Array2Modifkatorlar.User;

public class Main {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        User user=new User("Elman","sdsd",
                "sdsd",3);
        user.name="sd";

        user.setAddress("Baki sheri");
        System.out.println(user.getAddress());

    }
}
