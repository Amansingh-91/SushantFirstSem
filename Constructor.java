
package javaTut;
public class Constructor {
    String Fullname;

    Constructor(String name){
        Fullname = name;
    }
    public static void main(String[] args) {
        Constructor obj =  new Constructor("Aman Saini");
        System.out.println(obj.Fullname);
    }
}
