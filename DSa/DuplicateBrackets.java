package javaTut.DSa;

import java.util.Stack;

public class DuplicateBrackets {
    // (((a+b)) + (c+d))

    public static boolean checkDuplicate(String str){

        int count =0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ')'){
                stack.push(ch);
            }
            else{
                count ++;
                while (stack.peek() != '(') {
                    count =0;
                    stack.pop();
                }
                stack.pop();
                if(count >0){
                    return true;
                }
                
            }

        }
        // System.out.println(count);

        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkDuplicate("((a+b)+(c+z)+ (c+d))"));
    }
}
