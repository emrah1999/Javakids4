package lesson36collection3cuhisse;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Ayse");
        list.add("Fatma");
        list.add("Ahmet");
        System.out.println(list);

        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            String name=iterator.next();
            if(name.equals("Ayse")){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
