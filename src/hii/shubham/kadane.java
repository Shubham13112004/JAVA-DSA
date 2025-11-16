
import java.util.Scanner;

public class kadane {
     public static void main(String[] args) {
        System.out.println("Enter the Size ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i =0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int cs=0;
        int ms=Integer.MIN_VALUE;
        
        for(int i =0 ; i< arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Maximum sum is "+ ms);
        
    }
    
}
