package javaTut;
public class Animal {
    int age;
    String name;

    static int noOfAnimals ;

    // default
    Animal(){
        this.name = "unknown";
        noOfAnimals++;
    }

    
    

    public Animal(String name) {
        this.name = name;
    }




    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
        noOfAnimals++;
    }



    public void setDetails(int Age, String name){
        this.age =  Age;
        this.name = name;
        
    }
    
    public void showDetails(){
        System.out.printf("Animal name is %s and age is %d \n",this.name,this.age);
        

    }   
    public static void main(String[] args) {
        Animal obj1 = new Animal();
        obj1.setDetails(100, "Turtle");

        Animal obj2 = new Animal(12, "dog");
        // obj2.setDetails(12, "dog");

        System.out.println(obj1.noOfAnimals);

        Animal obj3 = new Animal(17,"cow");
        
        System.out.println(Animal.noOfAnimals);
        obj2.showDetails();

        obj1.age  = 110;

        obj1.showDetails();
        obj2.showDetails();

        obj3.showDetails();

        

    }
   
}
