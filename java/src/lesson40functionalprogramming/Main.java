package lesson40functionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits =new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("armud");

//        for (String fruit:fruits){
//            if(fruit.startsWith("a")) {
//                System.out.println(fruit);
//            }
//        }

//        fruits.stream().filter(f->f.startsWith("a")).forEach(s->System.out.println(s));
//
//
//        fruits.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

        fruits.stream().filter(s->s.endsWith("e"))
                .map(s->s.toUpperCase())
                .forEach(s->System.out.println(s));

        System.out.println("------------------");


        fruits.stream().map(s->s.toUpperCase()).forEach(System.out::println);


        final List<String> finalFruits =  List.of("apple","banana","orange","grape","armud");


    }
}
