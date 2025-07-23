import java.util.*;
public class basics {
    
    public static void main(String[] args)
    {
        //Variables
        //Basic Opertions
       
        int a=52;
        int b=10;
        int sum=a+b;
        int diff=a-b;
        int mul=a*b;
        int div=a/b;

        int ans=(a*b)/(a-b);

        //Output line
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(ans);



        //Input

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st value=");
        int s=sc.nextInt();
        System.out.print("Enter 2st value=");
        int t=sc.nextInt();
        int result=(s*t)/(s+t);
        System.out.println("The result is="+ result);


    }
}
