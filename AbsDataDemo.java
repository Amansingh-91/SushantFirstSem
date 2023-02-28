package javaTut;

import java.util.ArrayList;
import java.util.LinkedList;

public class AbsDataDemo {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>();

        obj.add(12);
        obj.add(13);
        obj.add(14);
        System.out.println(obj);
        obj.remove(1);
        System.out.println(obj.size());
        System.out.println(obj);

        LinkedList<Student> studentObj =  new LinkedList<>();
        studentObj.add(new Student("Aman"));
        studentObj.add(new Student("palak"));
        studentObj.add(new Student("Divya"));
        System.out.println(studentObj);

        ArrayList onjArray =  new ArrayList();

        onjArray.add(new Integer(12));

        onjArray.add(new String("12"));

        System.out.println(onjArray);

    }
}
class Student{
    String name;
    Student(String name){
        this.name =  name;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name;
    }

    

}
