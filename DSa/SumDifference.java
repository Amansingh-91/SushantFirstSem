package javaTut.DSa;

import java.util.HashSet;

public class SumDifference {
    public static void main(String[] args) {
        int N =  75;
        int arr[]={35,19,12,65,10};
        HashSet<Integer> set =  new HashSet<>();
        for(int i : arr){
            int diff = N - i;
            if(set.contains(diff)){
                System.out.println("Number whose sum is "+N+" are first:"+diff + " second: "+ i);
                break;
            }
            set.add(i);
        }
    }
}
