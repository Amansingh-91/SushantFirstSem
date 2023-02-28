package javaTut;

public class StringDemo {

    public static void main(String[] args) {
        String name = "aman";
        String firstName =  "aman";
        String lastName = "saini";
        String newName = "Divya";
        String objName =  new String("aman");
        String objName1 =  new String("aman");
        StringBuffer obj =  new StringBuffer("aman");
        StringBuffer obj1 = new StringBuffer(lastName); 
        // System.out.println(name == firstName);
        // System.out.println(name == newName);
        System.out.println(name == objName);
        // System.out.println(objName == objName1);
        System.out.println("***************************");
        System.out.println(name.equals(objName));
        System.out.println("***************************");
        System.out.println(name.compareTo(objName1));
        System.out.println(name.compareTo("Aman"));
        System.out.println(name.compareTo("Divya"));
        System.out.println("***************************");
        int arr[] =  new int[5];
        // System.out.println(arr.length);
        // System.out.println(newName.length());
        firstName.concat(lastName);
        System.out.println(firstName);

        obj.append(obj1);
        System.out.println(obj);
    }
    
}
