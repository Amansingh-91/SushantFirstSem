package javaTut;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer firstName = new StringBuffer("Aman");
        StringBuffer lastName = new StringBuffer(" Singh");
        String str = "Aman";
        String str1 = " Singh";

        firstName.append(lastName);
        String newStr= str + str1; 

        System.out.println(newStr);
        System.out.println(firstName);
        System.out.println(str);

    }
}
