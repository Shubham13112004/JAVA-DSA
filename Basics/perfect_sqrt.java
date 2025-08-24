import java.util.*;
public class perfect_sqrt {

    static boolean sqrt(long n){
        if(n<1){
            return false;
        }
        long s = 1;
        long e=n;;
        while(s<=e){
            long mid = s+(e-s)/2;
            long midsqrt=mid*mid;

            if(midsqrt==n){
                return true;
            }else if(midsqrt>n){
                e=mid-1;  
            }else{
                s=mid+1;
            }
        }
        return false;
    } 
    public static void main(String[] args) {
        System.out.println("Enter the number:-");
        Scanner sc = new Scanner(System.in);
        long root = sc.nextLong();

        System.out.println(sqrt(root));
    }
}
