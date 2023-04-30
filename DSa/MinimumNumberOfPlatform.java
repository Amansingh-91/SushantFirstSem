import java.util.Arrays;

public class MinimumNumberOfPlatform {
    public static void main(String[] args) {
        int a[]={900,940,950,1100,1500,1800};
        Arrays.sort(a);
        int d[]= {910,1200,1120,1130,1900,2000 };
        int count= 0;
        int max = 0;
        int j =0;
        for (int i = 0; i < a.length; i++) {
            
            if(a[i] < d[j]){
                count ++;
                if(max < count){
                    max = count;
                }
            }
            else{
                count=1;
                j++;
            }
            

        }
    System.out.println(max);
    }
}
