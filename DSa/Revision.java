package javaTut.DSa;

public class Revision { 
    public static void main(String[] args) {
        // data_type varName  = value;
        int num =123;
        Complex num1 = new Complex(12, 11);
        num1.printComplex();

        Complex num2 = new Complex(1, 14);
        num2.printComplex();

        Complex num3 = num1.addTwoComplex(num2);
        num3.printComplex();
    }
}

class Complex{
    int real;
    int imaginary;
    // access non-access return_type funcName(Parameters){
    //     code block
    // }
    Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public void printComplex(){
        System.out.println(this.real + " + i" +this.imaginary);
    }

    public Complex addTwoComplex(Complex num){
        int newReal = this.real + num.real;
        int newImaginary =  this.imaginary + num.imaginary;
        return new Complex(newReal, newImaginary);
    }


    
    
    
}