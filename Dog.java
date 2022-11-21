package javaTut;
public class Dog {
    String name; //null
    int age; // 0

    //static/class variable
    static int noOfDogs;

    Dog(){
        this.name = "unknown";
        this.age = -1;
        noOfDogs++;
    }

    Dog(String name , int age){
        this.age =  age;
        this.name =  name;
        noOfDogs++;
    }

    public void setDetials(String name, int Age){
        this.age =  Age;
        this.name =  name;
    }

    public void showDetials(){
        System.out.printf("my dog name is %s and its age is %d \n",this.name,this.age);
    }
    public static void main(String[] args) {
    
        Dog obj1 =  new Dog();
        obj1.showDetials();
        obj1.setDetials("Tom", 5);
        obj1.showDetials();

        Dog obj2 =  new Dog();

        System.out.println(obj1.noOfDogs);

        obj2.setDetials("jerry", 7);
        obj2.showDetials();
        obj1.showDetials();

        Dog obj3 = new Dog("jim",8);
        obj3.showDetials();
        System.out.println(Dog.noOfDogs);

        
        

    }
}
