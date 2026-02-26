package lesson36collection3cuhisse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorMain2 {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("Sevin",14));
        userList.add(new User("Jasmin",13));
        userList.add(new User("Teymur",12));
        userList.add(new User("Deniz",14));
        userList.add(new User("Nuray",34));
        userList.add(new User("Sevinc",23));
        userList.add(new User("Ibrahim",13));
        System.out.println("Original List:"+userList);

        Comparator<User> comparatorDouble= new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int ageCompare = o1.age.compareTo(o2.age);
                if (ageCompare != 0) {
                    return ageCompare;
                } else {
                    return o1.name.compareTo(o2.name);
                }
            }
        };
        Collections.sort(userList, comparatorDouble);
        System.out.println("Sorted Users by Age and Name:");
        System.out.println(userList);


        Comparator<User> comparator=Comparator.comparing(User::getAge).thenComparing(User::getName);
    }
}
