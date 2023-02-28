package javaTut.DSa;

public class Pattern1 {
    /*
     *          *****     *      1          @@@*
     *          *****     **     2          @@**        
     *          *****     ***    3          @***    
     *          *****     ****   4          ****            
     *          
     *          1
               121
              12321
             1235321
            123585321
     */

    public static void squarePattern(int n){
            
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
                
    }
    public static void rightTrianglePattern(int n){
        
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void invertedRightTrianglePattern(int n){
        for (int j = 1; j <= n; j++) {
            for (int k = n-j-1; k >=0 ; k--) {
                System.out.print(" ");
                
            }
            for (int i = 1; i <= (2 * j -1); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
    public static void main(String[] args) {
        // squarePattern(5);
        // rightTrianglePattern(5);
        invertedRightTrianglePattern(5);
    }
}
