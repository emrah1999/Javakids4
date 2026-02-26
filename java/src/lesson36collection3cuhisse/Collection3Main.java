package lesson36collection3cuhisse;

import java.util.ArrayList;
import java.util.Collections;

public class Collection3Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("List: " + list);
        Collections.sort(list);
        System.out.println("Sorted List: " + list);


        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("Alice", 30));
        userList.add(new User("Bob", 25));
        userList.add(new User("Charlie", 35));

        Collections.sort(userList);
        System.out.println("Sorted Users by Age:");
        System.out.println(userList);

    }
}
