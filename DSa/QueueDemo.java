package javaTut.DSa;

import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Aman");
        queue.add("Divya");
        queue.add("Dharam");

        System.out.println(queue);

        // queue.remove();
        // queue.remove();
        String deleted = queue.poll();
        System.out.println(deleted);

    }
}
