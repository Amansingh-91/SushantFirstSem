package javaTut;

public class Car extends Brand {
    
    String carName;
    String color;
    int passangerCapacity;
    boolean headlamp;
    
    Car(){
        
        this.carName = "unKnown";
        this.color = "unknown";
        this.passangerCapacity = 0;

    }
    

    public Car(String brand, String carName, String color, int passangerCapacity, boolean headlamp) {
        super(brand, "Car");
        this.carName = carName;
        this.color = color;
        this.passangerCapacity = passangerCapacity;
        this.headlamp = headlamp;
    }


    public void onHeadLamp(){
        this.headlamp = true;
        System.out.println("headlamps are now on...");
    } 
    public void offHeadLamp(){
        this.headlamp = false;
        System.out.println("headlamps are now off...");
    }
    public void headLampIndicator(){
        if(this.headlamp){
            System.out.println("head lamp on");
        }
        else{
            System.out.println("head lamp off");
        }
    }
    public void carDetails(){
        System.out.printf("Brand name: %s\ncar name: %s\nseat capacity: %d\ncar color: %s\nHeadlamp status: %b\n",this.getBrandName(),this.carName,this.passangerCapacity,this.color,this.headlamp);
    }


}
