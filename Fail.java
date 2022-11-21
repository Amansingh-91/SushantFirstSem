package javaTut;
import java.util.Scanner;

class Fail{

    public int firstRank(int marks[]){
        int max = -1;
        int rollNo = -1;
        for (int i = 0; i < marks.length; i++) {
            if(max < marks[i]){
                max = marks[i];
                rollNo = i;
            }
        }
        return rollNo;
    }
    public void inputMarks(int marks[],Scanner sc){
        
        for (int i = 0; i < marks.length; i++) {
            System.out.println("enter the marks of student with roll no. "+i);
            marks[i] = sc.nextInt();
            sc.nextLine();
        }
        
    }
    public void swapWithThirdVariable(int num1, int num2){
        System.out.println("with third variable");
        System.out.println("before swap "+ num1 +" and "+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("after swap "+ num1 +" and "+num2);
    }  
    public void swapWithoutThirdVariable(int num1, int num2){
        System.out.println("without third variable");
        System.out.printf("before swap %d and  %d \n",num1,num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.printf("after swap %d and  %d \n",num1,num2);
    }  
    public double celsiusToFahrenheit(double celsius){
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
       Fail obj = new Fail();
    //    System.out.println("enter number 1");
    //    int num1 = sc.nextInt();
    //    sc.nextLine();

    //    System.out.println("enter number 2");
    //    int num2 = sc.nextInt();
    //    sc.nextLine();
    //    obj.swapWithThirdVariable(num1,num2);
    //    obj.swapWithoutThirdVariable(num1,num2);

    //    System.out.println(num1 + " " + num2);

    //    System.out.println(obj.celsiusToFahrenheit(35.23));
    //    sc.close();
        int marks[] = new int[5];
        obj.inputMarks(marks,sc);
        System.out.println(obj.firstRank(marks));
    }
}