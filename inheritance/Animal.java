package javaTut.inheritance;
abstract class Animal{
    String name;
    int age;
    
    void eat(){
        System.out.println("eating");
    }

    abstract void speak();

    public Animal(){
        this.name = "unknown";
        this.age = -1;
        System.out.println("in Animal constructor");
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("in Animal constructor");
    }
    
}