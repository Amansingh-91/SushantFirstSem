package javaTut.LPU;
import java.util.Iterator;
import java.util.LinkedList;

public class OpenChaining {
    public static int myHash(String data,int n){
        return data.length() % n;
    }
    public static void insertData(LinkedList<String> arr[],String data){
        int index = myHash(data, arr.length);
        arr[index].addFirst(data); 
    }
    public static boolean searchData(LinkedList<String> arr[], String key){
        int index = myHash(key, arr.length);
        Iterator<String> it = arr[index].iterator();
        while (it.hasNext()) {
            String data = it.next();
            if(data.equalsIgnoreCase(key)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
      LinkedList<String> arr[] = new LinkedList[5]; 
      for (int i = 0; i < arr.length; i++) {
        arr[i] = new LinkedList<>();
      }

      LinkedList<String> str = new LinkedList<>();
      str.add("Aman");
      str.add("Divya");
      
      System.out.println(str);
      LinkedList<Student> student= new LinkedList<>();
      student.add(new Student("Aman"));
      student.add(new Student("Divya"));
      System.out.println(student);
      
      
    }
}
