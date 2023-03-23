package javaTut.DSa;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> names =  new HashSet<>();
        names.add("Aman");
        names.add("Divya");
        names.add("dharam");
        names.add("Aman");
        names.add("Divya");
        System.out.println(names);
        // delete
        names.remove("Divya");
        System.out.println(names);
        // iterate

        for (String name : names) {

            System.out.println(name);
            
        }

        Iterator<String> it  = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }    
}
