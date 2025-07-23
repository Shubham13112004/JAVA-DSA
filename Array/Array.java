import java.util.*;
public class Array {
    
    public static void main(String [] args)
    {
    Scanner sc = new Scanner(System.in);
      
    System.out.println("Enter the size of array");
    int size=sc.nextInt();
    int[] num = new int[size];
  
    System.out.println("Enter the elements of array");
    for(int i=0;i<num.length;i++)
    {
        num[i]=sc.nextInt();
    }
    for(int i=0;i<num.length;i++)
    {
        System.out.print(num[i]);
        System.out.print("\t");

    }
    System.out.println("\nMinimum and Maximum\n");

    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE; 


    for(int i=0;i<num.length;i++)
    {   
        if(num[i]<min)
        {
            min=num[i];
        }
                                                                                                                                
        if(num[i]>max)
        {
            max=num[i];
        }
    }

    System.out.println("max = "+max);
    System.out.println("min = "+min);

 
        sc.nextLine();
    System.out.println("Enter the name ");
   

   String num1 [] = new String[5];
  
  
   for(int i =0;i<num1.length;i++)
   {
    num1[i]=sc.nextLine();
   }

   for(int i=0;i<num1.length;i++)
   {
    System.out.println("The Name is "+(i+1)+ ":"+ num1[i]);
   }

   System.out.println("2D array ");

Scanner input = new Scanner(System.in);

System.out.println("Enter the no of rows and column ");
int row=input.nextInt();
int col=input.nextInt();
int [][] numbers = new int[row][col];

for(int i=0;i<numbers.length;i++)
{
    for(int j=0;j<numbers[i].length;j++)
    {
        numbers[i][j]=input.nextInt();
    }
}

for(int i=0;i<numbers.length;i++)
{
    for(int j=0;j<numbers[i].length;j++)
    {
       System.out.print( numbers[i][j] + " ");
    }
    System.out.println();
}

System.out.println("Sum of odd Numbers");

System.out.println("Enter the range of numbers");
int range=sc.nextInt();
int sum=0;
for(int i=0;i<=range;i++)
{
    if(i%2!=0)
    {
          sum=sum+i;
    }
  
}
System.out.println("The sum of odd no is "+sum);
}

}




