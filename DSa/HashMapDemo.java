package javaTut.DSa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> students = new HashMap<>();
        students.put(1, "Aman");
        students.put(2, "Dharam");
        students.put(3, "jack");
        students.put(4, "jhon");
        System.out.println(students);
        // updating
        students.put(1, "Divya");
        System.out.println(students);
        // deleting 
        students.remove(1);
        System.out.println(students);

        for (Map.Entry<Integer,String> entry : students.entrySet()) {
            System.out.println("roll no. :" + entry.getKey() + " name :" + entry.getValue());
        }

        Iterator<Map.Entry<Integer,String>> it = students.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            System.out.println("roll number. :" + entry.getKey() + " name :" + entry.getValue());
        }




    }
}
