package javaTut.inheritance;
class Animal{
    private String name;
    private int age;
    
    void eat(){
        System.out.println("eating");
    }

    void speak(){
        System.out.println("speaking");
    }

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

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name =  name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}