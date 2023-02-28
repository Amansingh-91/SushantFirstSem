package javaTut;

public class ConstructorDemo {
    
    public static void main(String[] args) {
        A obj = new B();
        B obj1 =  new B();
        obj.display();
        // obj.talk();
    }
}
class A{
    
    
    A(String str){
        
    }
    void display(){

    }
}
class B extends A{
    int a;
    @Override
    void display(){
        System.out.println("in child");
    }
    void talk(){

    }
    B(){
        super("Aman");

    }
    B(int a){
        super("Aman");
    }
    
}