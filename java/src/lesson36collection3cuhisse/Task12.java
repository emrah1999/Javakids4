package lesson36collection3cuhisse;

import java.util.*;

public class Task12 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ali", 25);
        map.put("Veli", 30);
        map.put("Ayse", 22);


        HashSet<String> set = new HashSet<>(map.keySet());
        System.out.println(set);

        for(String key: map.keySet()){
            if(key.startsWith("A")){
                System.out.println(key + ": " + map.get(key));
            }
        }

        ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println(list);
        list.sort((Map.Entry.comparingByValue()));
        System.out.println(list);
        LinkedHashMap<String,Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String,Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(sortedMap);
    }
}
