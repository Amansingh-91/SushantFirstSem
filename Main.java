package javaTut;

public class Main {
    public static void main(String[] args) {
      Encapsulation obj = new Encapsulation();
      Encapsulation obj1 = new Encapsulation(26,"Divya");


      System.out.println(obj.name);
      System.out.println(obj.age);
      System.out.println(obj1.name);
      System.out.println(obj1.age);

    }
}
