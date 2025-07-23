import java.util.*;
public class loops {
    public static void main(String [] args){

        //for loop 
        for(int i=0;i<10;i++){
           System.out.println("hello world");
        }

        System.out.println("Numbers from 1 to 10");

        for(int counter=1;counter<=10;counter++){
            System.out.println(counter);
        }

        //while loop

        System.out.print("Print Table of Number =");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(i<=10)
        {
            System.err.println(num*i);
            i++;
        }
        int a=1;
        //do while loop
        System.err.println("do while loop");
        do{
            System.err.println(a);
            a++;
        }while(a<=10);

        //print the sum of n natural numbers
        System.out.print("Sum of all natural numbers is =");
        int value=sc.nextInt();
        int sum=0;
        for(int c=1;c<=value;c++)
        {
             sum=sum+c;
        }
         System.out.println(sum);


    }
    
}
