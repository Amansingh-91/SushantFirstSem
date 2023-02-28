package javaTut;

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str =sc.nextLine();
        System.out.println("removing spaces");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' '){
                ch = '@';
                // System.out.println("in here");
                // System.out.print(ch);
            }
            System.out.print(ch);
        }
        System.out.println();
    }
}
