package lesson36collection3cuhisse;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionMain {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        number.add(13);
        number.add(4);
        number.add(66);
        number.add(34);
        number.add(9);
        System.out.println(number);
        System.out.println("Sorted list");
        Collections.sort(number);
        System.out.println(number);

        System.out.println("Shuffled list");

        Collections.shuffle(number);
        System.out.println(number);

        System.out.println("Reversed list");
        Collections.reverse(number);
        System.out.println(number);

        System.out.println("Max "+ Collections.max(number));
        System.out.println("min "+ Collections.min(number));
    }
}
