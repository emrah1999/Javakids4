package lesson34genericsclass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetrMain {
    public static void main(String[] args) {
        HashSet<String> stringHashSet=new HashSet<>();
        stringHashSet.add("Arif");
        stringHashSet.add("Deniz");
        stringHashSet.add("Nuray");
        System.out.println(stringHashSet);

        TreeSet<String> stringTreeSet=new TreeSet<>();
        stringTreeSet.add("Arif");
        stringTreeSet.add("Sevin");
        stringTreeSet.add("Deniz");
        System.out.println(stringTreeSet);

        HashSet<Integer> arrayList=new HashSet<>();
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(33);
        System.out.println(arrayList);
    }
}
