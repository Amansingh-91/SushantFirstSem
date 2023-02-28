import java.util.Scanner;
public class ExceptionDemo {
    public static void main(String args[]){
        int balance =  5000;
        Scanner sc = new Scanner(System.in);
        int with;
        System.out.println("Enter amount to withdraw");
        try{
            with =  sc.nextInt();
            sc.nextLine();
            String name =  sc.nextLine();
            if(balance < with){
                throw(new MyException("insufficient balance"));
            }
            else{
               balance = balance -  with;
               System.out.println("amount withdraw successfull");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class MyException extends Exception{
    MyException(String str){
        super(str);
    }
}