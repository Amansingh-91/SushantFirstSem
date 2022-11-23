package javaTut.inheritance;

public class Dog extends Animal{
    String breed;
    public Dog() {

        super("Sheru",12);
        System.out.println("in dog constructor");
        
    }

    

    public Dog(String name, int age) {
        super(name, age);
    }

    void speak(){
        System.out.println("barking");
    }


    public static void main(String[] args) {
        Dog obj =  new Dog();
        Animal newObj =  new Dog();
        // Animal obj1 =  new Animal();
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.breed);
        System.out.println(newObj.name);
        System.out.println(newObj.age);
        // System.out.println(newObj.breed);
        obj.eat();

        obj.speak();
        
        // obj1.speak();

    }
    
}
