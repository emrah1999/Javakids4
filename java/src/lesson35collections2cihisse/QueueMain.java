package lesson35collections2cihisse;

import java.util.*;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
//        queue.add("Ali");

        queue.offer("Veli");
        queue.offer("Ali");
        queue.offer("Eli");
        System.out.println(queue);

//        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue);

//        System.out.println(queue.element());
        System.out.println(queue.peek());
    }
}
