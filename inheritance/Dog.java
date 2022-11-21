package javaTut.inheritance;

public class Dog extends Animal{
    
    public Dog() {
        super("Sheru",12);
        System.out.println();
        
    }

    

    public Dog(String name, int age) {
        super(name, age);
    }

    


    public static void main(String[] args) {
        Dog obj =  new Dog();
        // Animal obj1 =  new Animal();
        System.out.println(obj.name);
        System.out.println(obj.age);
        obj.eat();

        obj.speak();
        
        // obj1.speak();

    }
    
}
