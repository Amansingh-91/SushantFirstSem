package javaTut;
public class DataHiding {

    
    public  int x;
    private int y;
    protected int z;
    int a;

    public static void main(String[] args) {
        DataHiding obj =  new DataHiding();
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        System.out.println(obj.a);

    }




}
