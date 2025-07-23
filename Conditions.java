import java.util.*;

public class Conditions {
    public static void main(String[] args )
    {
        System.out.print("Enter Your Age=");


        Scanner sc =new Scanner(System.in);
        int age=sc.nextInt();

        // if-else

        if(age>18)
        {
            System.out.println("You are Adult");
        }
        else
        {
             System.out.println("You are NOT Adult"); 
        }


        //if-else if

        System.out.print("Enter The Number=");

        int num=sc.nextInt();

        if(num<0)
        {
              System.out.println("Your Number "+ num + " is Negative");
        }
         else if(num%2==0)
        {
              System.out.println("Your Number "+ num + " is Even");
        }
        else{
              System.out.println("Your Number "+ num + " is Odd");
        }


        System.out.print("Enter The Number a=");

        int a=sc.nextInt();

         System.out.print("Enter The Number b=");

        int b=sc.nextInt();


        if(a==b)
        {
              System.out.println("Both number are Equal");
        }
         else if(a>b)
        {
              System.out.println(a+" is Greater Than "+b);
        }
        else{
              System.out.println(b+" is Greater Than "+a);
        }

        
        // Switch case

        System.out.print("Enter 1.HI\n 2.HELLO\n 3.HEY\n");
        int button=sc.nextInt();

        switch(button){

            case 1:
            System.out.println("HI");
            break;

            case 2:
            System.out.println("Hello");
            break;

            case 3:
            System.out.println("Hey");
            break;

            default:
            System.out.println("INVALIDE");
        }

    }
}

