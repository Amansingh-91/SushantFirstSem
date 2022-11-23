package javaTut;

public class TataCar extends Car{
    int noOfGearShift;

    public TataCar() {
        // System.out.println();
        super("TATA","unknown","unknown",0,false);
        
    }

    public TataCar(int noOfGearShift) {
        // System.out.println();
        super("TATA","unknown","unknown",0,false);
        this.noOfGearShift = noOfGearShift;
    }

    public TataCar( String carName, String color, int passangerCapacity, boolean headlamp,
            int noOfGearShift) {
        super("TATA", carName, color, passangerCapacity, headlamp);
        this.noOfGearShift = noOfGearShift;
    }


    public static void main(String[] args) {
        TataCar nano = new TataCar("nano", "white", 4, false, 4);
        TataCar obj =  new TataCar(0);

        nano.carDetails();
        System.out.println("*****************************************");
        obj.carDetails();
        System.out.println("*****************************************");
        nano.onHeadLamp();
        System.out.println("*****************************************");
        nano.carDetails();
        System.out.println("*****************************************");
        nano.headLampIndicator();
    }

    
}
