import java.util.Stack;

public class ReverseStack {
    public static Stack<Integer> reverse(Stack<Integer> s){
        int n = s.size();
        if(n >0){
            Stack<Integer> temp =  new Stack<>();
            for (int i = 0; i < n; i++) {
                temp.push(s.pop());
            }
            
            s =  temp;
        }
        return s;
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        s = reverse(s);
        System.out.println(s);
    }
}
