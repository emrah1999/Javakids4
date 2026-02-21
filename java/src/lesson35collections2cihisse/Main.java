package lesson35collections2cihisse;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Deniz");
        list.add("Ibrahim");
        list.add("Nihat");
        list.add("Teymur");
        System.out.println(list);

        if(list.contains("Nihat")){
            System.out.println("Nihat listede var");
            list.remove("Nihat");
        }else{
            System.out.println("Nihat listede yok");
        }

        System.out.println(list.get(2));


        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        for (Integer reqem:list2){
            if(reqem==2){
                System.out.println("2 reqemi var");
            }
        }

        System.out.println(list2);
//        list2.remove(2);
//        System.out.println(list2);
//        list2.remove(Integer.valueOf(2));
        Integer a=2;
        list2.remove(a);
        System.out.println(list2);

        list2.set(2,100);
        System.out.println(list2);

        list2.add(2, 100);
        System.out.println(list2);



    }
}
