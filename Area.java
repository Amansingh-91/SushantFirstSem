package javaTut;

public class Area {
    // method overloading
    
    // square area
    int area(int a){
        return a * a;
    }
    
    // recatangle area 
    int area(int a,int b){
        return a * b;
    }

    // circle area 
    double area(double radius){
        return 3.14 * radius * radius;
    }

    
    // triangle area 
    double area(Double a,int b){
        return a * b;
    }
    

    public static void main(String[] args) {
        Area obj =  new Area(); 
        
        System.out.printf("area of circle %f\n",obj.area(5.0));
        System.out.printf("area of square %d\n",obj.area(5));
        System.out.printf("area of triangle %2.3f\n",obj.area(15.0,3));

    }


}
