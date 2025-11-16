
import java.util.*;
public class MaxSum {
    public static void main(String[] args) {
        System.out.println("Enter the Size ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i =0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        
        for(int i =0 ; i< arr.length;i++){
            int start=i;
            for(int j =i ; j<arr.length;j++){
                int end = j;
                currentSum=0;
                for(int k =start;k<=end;k++){
                    currentSum+=arr[k];
                }
                System.out.println(currentSum);
                if(maxSum<currentSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println(maxSum); 
    }
}
