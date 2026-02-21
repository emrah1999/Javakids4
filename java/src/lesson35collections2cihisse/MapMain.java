package lesson35collections2cihisse;

import lesson34genericsclass.User;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapMain {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        //key,value
        map.put(1,"Java");
        map.put(56,"Python");
        map.put(98,"Python");
        map.put(3,"C#");
        System.out.println(map);

        HashMap<String,String> map2 = new HashMap<>();
        map2.put("Azerbaycan","Baku");
        map2.put("Turkiye","Ankara");
        map2.put("Almaniya","Berlin");
        System.out.println(map2);

        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.put("Azerbaycan","Baku");
        treeMap.put("Turkiye","Ankara");
        treeMap.put("Almaniya","Berlin");
        treeMap.put("Turkiye","Istanbul");
        System.out.println(treeMap);

        System.out.println(map2.get("Turkiye"));
        treeMap.remove("Turkiye");
        System.out.println(treeMap);
        if(treeMap.containsKey("Turkiye")){
            System.out.println("Var");}else{
            System.out.println("Yok");
        }

        Set<String> keys = treeMap.keySet();
        System.out.println(keys);

        TreeMap<Integer, User> users=new TreeMap<>();
        users.put(3,new User("A"));
        users.put(4,new User("B"));
        users.put(5,new User("C"));
        users.put(7,new User("D"));
        System.out.println(users);
    }
}
