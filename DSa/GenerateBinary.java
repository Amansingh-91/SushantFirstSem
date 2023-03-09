package javaTut.DSa;

import java.util.Queue;
import java.util.LinkedList;

public class GenerateBinary {
    public static void generate(int n){
        String s1 = "1";
        String s2 = null;
        Queue<String> queue1 = new LinkedList<>();
        queue1.add(s1);
        while (n-- > 0) {
            
            s1 = queue1.poll();
            System.out.println(s1);
            s2 = s1 + "1";
            s1 = s1 + "0";
            
            queue1.add(s1);
            queue1.add(s2);
        }
    }
    public static void main(String[] args) {
        generate(5);
    }
}
