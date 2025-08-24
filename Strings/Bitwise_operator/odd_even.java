import java.util.*;
public class odd_even {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num & 1) == 1){
            System.out.println("The number is odd");
        }else{
            System.out.println("Number is even");
        }
    }
    
}
