package javaTut.inheritance;

public class StaticFinalDemo {
    static int x =100;
    int y;

    StaticFinalDemo(int y){
        this.y = y;
    }
    static void print(){
        System.out.println("printing");
    }

    void display(){
        System.out.println("in display");
    }

    public static void main(String[] args) {
        StaticFinalDemo obj =  new StaticFinalDemo(12);
        StaticFinalDemo obj1 =  new StaticFinalDemo(11);
        obj.x =  12;
        obj.y = 13;

        obj1.x =  1;
        obj1.y = 15;
        System.out.printf("obj x =  %d and obj1 x =  %d \n",obj.x,obj1.x);
        System.out.printf("obj y =  %d and obj1 y =  %d \n",obj.y,obj1.y);
        obj.display();
        StaticFinalDemo.print();

    }

}
