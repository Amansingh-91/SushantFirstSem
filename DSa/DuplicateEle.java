package javaTut.DSa;

import java.util.HashSet;

public class DuplicateEle {
    public static void main(String[] args) {
        int arr[] = {5,1,3,2,5,3,4};
        HashSet<Integer> dup =  new HashSet<>();
        for (int Number : arr) {
            if(dup.contains(Number)){
                System.out.println("duplicate element present");
                return;

            }
            dup.add(Number);

        }
        System.out.println("all Numbers are distinct");
    }
}
