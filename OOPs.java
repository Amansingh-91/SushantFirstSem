
package javaTut;
class OOPs{
    public static void main(String[] args) {
        
        Dog sheru =new Dog();
        sheru.name = "sheru";
        sheru.age = 2;
        // sheru.breed = "gsd";
        // sheru.NoOfDogs =5;

        Dog tom =new Dog();
        tom.name = "tommy";
        tom.age = 3;
        // tom.breed = "pug";

        System.out.println(sheru.name);
        System.out.println(tom.name);
        // System.out.println(Dog.NoOfDogs);
        int x =10;
        if(x == 10){
            System.out.println("x "+x);
            int y = 5;
        }
        // System.out.println("y" + y);
        // System.out.println("x "+x);
        


    }
    
}
// class Dog{
//     static int NoOfDogs=0;
//     String name;
//     int age;
//     String breed;
//     public void bark(){
//         System.out.println("barking");
//     }
//     public void walk(){
//         System.out.println("walking");
//     }
//     public void sleep(){
//         System.out.println("sleeping");
//     }
// }