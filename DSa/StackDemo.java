package javaTut.DSa;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer>  s =  new Stack<>();
        s.push(12);
        s.push(13);
        s.push(14);
        int deleted =  s.pop();
        // s.clear();
        System.out.println(s.peek());//13
        System.out.println(s);//12,13
        System.out.println(deleted);//14
        s.clear();
        System.out.println(s.isEmpty());
    }
}
