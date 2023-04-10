package javaTut.DSa;

import java.util.Stack;

public class Palendrome {
    public static boolean isPalendrome(String str){
        Stack<Character> stack = new Stack<>();

        for (int i =0; i < str.length() ;i++) {
            stack.push(str.charAt(i));
        }
        String rev ="";
        while (!stack.isEmpty()) {
            rev += stack.pop();
        }

        if(rev.equals(str)){
            return true;
        }

        return false;

    }
    public static void main(String[] args) {
        System.out.println(isPalendrome("racecar"));
        System.out.println(isPalendrome("Aman"));
    }
}
