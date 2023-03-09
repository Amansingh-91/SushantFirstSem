package javaTut.DSa;

import java.util.Stack;

public class BracketBalance {
    public static boolean isBalanced(String brackets){
        if(brackets.length() % 2 != 0  ){
            return false;
        }
        else{
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < brackets.length(); i++) {
                
                char ch = brackets.charAt(i);
                if(ch == '{' || ch == '(' || ch == '[' || ch =='<'){
                    stack.push(ch);
                }
                else{

                    if(stack.isEmpty()){ // }}}}
                        return false;
                    }
                    char poppedEle = stack.pop();
                    if((ch=='}' && poppedEle != '{')||(ch==')' && poppedEle != '(')||(ch==']' && poppedEle != '[')||(ch=='>' && poppedEle != '<')){
                        return false;
                    }

                }
                

            }
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{()[]}"));
        System.out.println(isBalanced("{()[]}}}"));
        System.out.println(isBalanced("{{{()[]}"));
    }
}
