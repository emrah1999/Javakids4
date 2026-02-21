package lesson35collections2cihisse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        ArrayList<String> food=new ArrayList<>();
        food.add("Pizza");
        food.add("Burger");
        food.add("Pasta");
        food.add("Pasta");
        food.add("Pasta");
        food.add("Salad");
        food.add("Pizza");
        food.add("Salad");
        food.add("Salad");
        food.add("Salad");

        HashMap<String,Integer> foodCount=new HashMap<>();
        for(String f:food){
            //f=burger
            if(foodCount.containsKey(f)){
                foodCount.put(f,foodCount.get(f)+1);
            }else{
                foodCount.put(f,1);
            }
            //{pizza=2,burger=1,pasta=3,salad=4
        }
        System.out.println(foodCount);

        for (String key:foodCount.keySet()){
            System.out.println(key+" "+foodCount.get(key));
        }



    }
}
