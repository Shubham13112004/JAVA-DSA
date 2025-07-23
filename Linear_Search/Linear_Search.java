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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {2,5,3,7,6,8};
        System.out.println("Enter the target");
        int n = sc.nextInt();
        int ans = Search(arr,n);
        if(ans==-1){
             System.out.println("Element not found!!");
    }
    else{
         System.out.println(n +"Element found at index"+ ans);
    }

    }
}

