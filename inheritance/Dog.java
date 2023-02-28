package javaTut.inheritance;

public class Dog extends Animal{
    private String breed;
    public Dog() {
        
        this.breed =  " ubnknown";
        
    } 

    public Dog(String name, int age,String breed) {
        super(name, age);
        this.breed = breed;
    }
    @Override
    void speak(){
        System.out.println("barking");
    }
    
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        Dog obj =  new Dog();

        Dog tom =  new Dog("Tom", 1, "GSD");

        // Dog obj =  new Dog();
        // Animal newObj =  new Dog();
        // // // Animal obj1 =  new Animal();
        // // System.out.println(obj.name);
        // // System.out.println(obj.age);
        // // System.out.println(obj.breed);
        // // System.out.println(newObj.name);
        // // System.out.println(newObj.age);
        // // System.out.println(newObj.breed);
        // obj.eat();

        // obj.speak();
        
        // obj1.speak();






    }

    
    
}
