import java.util.*;
public class functions {

    public static int addTwoNumbers(int a,int b)
    {
        int sum=a+b;
        return sum;
    }

    
      public static int mulTwoNumbers(int a,int b)
    {
        int sum=a*b;
        return sum;
    }

      public static int subTwoNumbers(int a,int b)
    {
        int sum=a-b;
        return sum;
    }

      public static int facNumber(int a)
 
    {
             int factorial=1;
        if(a<=0)
        {
            return 1; 
        }
        else{
            for(int i=a;i>=1;i--)
            {
                factorial=factorial*i;
            }
        }
    
        return factorial;
    }

    
    public static void fabbNumber(int n)
    {
        int a=0;
        int b=1;
        System.out.println("Fabinicco series is\n");
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+ " \n");
        int z=a+b;
            a=b;
            b=z;
        }

    }
     public static void cal(Scanner sc)
     {
        int num,zero=0,positive=0,negative=0;

        while(true){

            System.out.println("Enter no upto 100 and For Stop Enter 101");
            num=sc.nextInt();

            if(num==101)
            {
                break;
            }
            else if(num==0)
            {
                zero++;
            }
            else if(num>0)
            {
                positive++;
            }
            else
            {
                negative++;
            }
        }
        System.out.println("No of Zeroes is "+zero);
        System.out.println("No of Positive is "+positive);
        System.out.println("No of Negative is "+negative);
     }

     public static void gcd(Scanner sc)
     {
        System.out.println("enter two no for gcd");
        int a=sc.nextInt();
        int b=sc.nextInt();

        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD is "+a);
     }

    

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();


        System.out.println("Addition "+addTwoNumbers(a, b));
        System.out.println("Subtraction "+subTwoNumbers(a, b));
        System.out.println("Multiplication "+mulTwoNumbers(a, b));
        System.out.println("Factorial of "+a +" is "+facNumber(a));
        fabbNumber(a);
        cal(sc);
        gcd(sc);


    }
    
}
