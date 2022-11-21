package javaTut;
public class Encapsulation{
    public int age;
    public String name;

    public Encapsulation(){
        this.name = "Aman";
        this.age =  27;
        System.out.println("in default ");
    }

    public Encapsulation(int age, String name) {
        
        this.age = age;
        this.name = name;
    }
    // public static void main(String[] args) {
    //       Encapsulation obj =  new Encapsulation() ;
    
    //       Encapsulation obj1 =  new Encapsulation(26,"Divya") ;
    
    //       System.out.println(obj.name);
    //       System.out.println(obj.age);
    //       System.out.println(obj1.age);
    //     }

}