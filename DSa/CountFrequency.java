

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int arr[] = {5,1,3,2,5,3,5};
        HashMap<Integer,Integer> count = new HashMap<>();
        for (int i : arr) {
            if(count.containsKey(i)){
                count.put(i, count.get(i)+1);
                continue;
            }
            count.put(i,1 );
        }
        Iterator<Map.Entry<Integer,Integer>> it = count.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer,Integer> entry = it.next();
            int key = entry.getKey();
            int value = entry.getValue();
            if(value > 1 ){
                System.out.println("Number is:" + key+ " with frequency:" + value);

            }
        }   

    }
}
