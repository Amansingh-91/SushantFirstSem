package javaTut;
public class Human{
    //instance variable
    int age;
    String name;
    double height;

    //class or static variable
    static int noOfHuman ;

    // constructor
    // default
    // public Human() {
    //     this.age = 18;
    //     this.name = "gopu";
    //     this.height = 5.0;
    // }

    // parameterized constructor
    public Human(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
        noOfHuman++;
    }

    

    public Human(String name) {
        this.name = name;
        noOfHuman++;
    }



    public void setDetails(int Age, String name,double height){
        this.age = Age;
        this.name = name;
        this.height = height;
    }
    

    

    

    public void showDetails(){
        System.out.printf("Name is %s age is %d years height is %5.2f ft \n",name,this.age,this.height);
    }
    public static void main(String[] args) {
        
        Human obj1 = new Human(27,"Aman",6.0);
        
        // obj1.setDetails(27,"Aman",6.0);
        Human obj2 = new Human(26,"Dharam",6.1);
        // obj2.setDetails(26,"Dharam",6.1);

        Human obj3 = new Human(29,"navs",7.0);

        obj1.showDetails();
        obj1.name = "divya";
        obj2.showDetails();

        obj1.showDetails();

        obj3.showDetails();

        Human obj4 =  new Human("uncle jhon");

        obj4.showDetails();

        System.out.println(obj1.noOfHuman);
        System.out.println(obj2.noOfHuman);
        obj3.noOfHuman = 8;
        System.out.println(Human.noOfHuman);
        
    }
    
    public void walk(){
        
    }
}