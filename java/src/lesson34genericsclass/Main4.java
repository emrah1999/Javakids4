package lesson34genericsclass;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        ArrayClass arrayClass=new ArrayClass();
        arrayClass.addElement(1);
        arrayClass.addElement(2);
        arrayClass.addElement(3);
        arrayClass.addElement(4);
        arrayClass.addElement(4);
        arrayClass.addElement(4);
        arrayClass.addElement(4);
        System.out.println(arrayClass);

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(33);
        System.out.println(arrayList);

        ArrayList<String> stringArrayList=new ArrayList<>();
        stringArrayList.add("Arif");
        stringArrayList.add("Deniz");
        stringArrayList.add("Nuray");
        stringArrayList.add("NIhat");
        stringArrayList.add("Teymur");
        stringArrayList.add("Ibrahim");
        System.out.println(stringArrayList);

        ArrayList<User> userList=new ArrayList<>();
        User user1=new User();
        user1.name="Arif";
        userList.add(user1);
        userList.add(new User("Nuray"));
        userList.add(new User("Teymur"));
        userList.add(new User("Nihat"));
        System.out.println(userList);

        List<String> list=new ArrayList<>();
    }
}
