package javaTut;
public class Cat{

    // instance variable
    String color;
    String name;
    int age;

    // static/class variable

    static int noOfCats;

    
    // default constructor
    Cat(){
       this.name = "tom";
       this.age = 1;
       this.color = "fon";
       noOfCats++;

    }

    // parameterized constructor
    Cat(String name,String color,int Age){
        this.age = Age;
        this.name = name;
        this.color = color;
        noOfCats++;
    }


    public void setDetails(String name,String color,int Age){
        this.age = Age;
        this.name = name;
        this.color = color;

    }

    public void showDetials(){
        System.out.printf("the cat name is %s , its age is %d and color is %s \n",this.name,this.age,this.color);
    }

    public static void main(String[] args) {
        
        Cat obj1 =  new Cat();
        obj1.showDetials();
        obj1.setDetails("sheru", "white", 11);
        obj1.showDetials();

        Cat obj2 =  new Cat();
        obj2.setDetails("novo", "blond", 2);
        obj2.showDetials();

        System.out.println(obj1.noOfCats);

        Cat obj3 = new Cat("jerry","brown",2);
        obj3.showDetials();
        System.out.println(Cat.noOfCats);
       
    }
}