import java.util.*;
public class Linear_Search {
    static int Search(int []arr,int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }

    static boolean yes(int [] arr, int n){
         for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {2,5,3,7,6,8};
        System.out.println("Enter the target");
        int n = sc.nextInt();
        int ans = Search(arr,n);
        boolean abc = yes(arr,n);
        System.out.println(abc);
        if(ans==-1){
             System.out.println("Element not found!!");
    }
    else{
         System.out.println(n +"Element found at index"+ ans);
    }

    }
}

