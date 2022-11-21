package javaTut.inheritance;
class Animal{
    String name;
    int age;
    void eat(){
        System.out.println("eating");
    }
    void speak(){
        System.out.println("speaking");
    }
    public Animal(){

    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
}