package javaTut.DSa;
import java.util.*;
public class StackUsingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(13);
        queue.add(14);

        int n = queue.size();

        while (n-- > 1) {
            int del = queue.poll();
            queue.add(del);
        }
        int del = queue.poll();
        System.out.println(queue);
        System.out.println(del);

    }
}
