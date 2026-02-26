package lesson36collection3cuhisse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorMain {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("Sevinc",14));
        userList.add(new User("Nuray",12));
        userList.add(new User("Ibrahim",13));
        userList.add(new User("Arif",23));
        userList.add(new User("Teymur",20));

        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.age.compareTo(o2.age);
            }
        });
        System.out.println("Sorted Users by Age:");
        System.out.println(userList);

            Collections.sort(userList, new Comparator<User>(){
                @Override
                public int compare(User o1, User o2) {
                    return o1.name.compareTo(o2.name);
                }
            });
        System.out.println("Sorted Users by Name:");
        System.out.println(userList);
    }
}
