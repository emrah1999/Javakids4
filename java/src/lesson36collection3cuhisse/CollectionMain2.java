package lesson36collection3cuhisse;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionMain2 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Ali");
        names.add("Veli");
        names.add("Ayşe");
        names.add("Fatma");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

         int a= Collections.binarySearch(names,"Ayşe");
        System.out.println(a);

        Collections.rotate(names, 2);
        System.out.println(names);

        ArrayList<String> names2=new ArrayList<>();
        Collections.copy(names2,names);
        System.out.println(names2);
    }
}
