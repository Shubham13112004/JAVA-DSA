import java.util.*;
public class patterns {
    public static void main(String[] args)
    {


        Scanner sc = new Scanner(System.in);
        System.err.print("Enter The No of Rows ");
        int row=sc.nextInt();
        System.err.print("Enter The No of Column ");
        int  col=sc.nextInt();

        //Solid Rectangle
    
        System.out.print("Solid Rectangle\n");
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

         //Hollow Rectangle

        System.out.print("Hollow Rectangle\n");
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if(i==1 || j==1 || i==row || j== col)
                {
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //half pyramid

         System.out.print("Enter The value of n for Half Pyramid ");
         int n=sc.nextInt();

        System.out.print("Half Pyramid\n");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Inverted half pyramid

        System.out.print("Inverted Half Pyramid\n");
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

            //Inverted half pyramid 180 degree

        System.out.print("Inverted Half Pyramid 180\n");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print ("*");
            }
            System.out.println();
        }

        // 0-1 Triangle
        System.out.println("0-1 Triangle ");

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int sum=i+j;
                if(sum%2==0)
                {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
              
            }
              System.out.println();
        }

        //half pyramid with numbers

        System.out.println("half pyramid with numbers");
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //Inverted half pyramid with numbers

        System.out.println("Inverted half pyramid with numbers");

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
              System.out.println();
        }

        //Floyd's Triangle

        System.out.println("Floyd's Triangle");

        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

        //Advanced Patterns

        //Butterfly pattern
     
        System.out.println("Butterfly pattern \n");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            int space=2 * (n-i);
            for(int j=1;j<=space;j++)
            {
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


          for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            int space=2 * (n-i);
            for(int j=1;j<=space;j++)
            {
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


        // Solid Rhombus

        System.out.println("Solid Rhombus \n");
        for(int i=1;i<=n;i++)
        {
            int blank=n-i;
            for(int j=1;j<=blank;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++)
            {

                System.out.print("* ");
            }
            System.out.println();
        }

        //Hollow Rhombus

         System.out.println("Hollow Rhombus \n");
        for(int i=1;i<=n;i++)
        {
            int blank=n-i;
            for(int j=1;j<=blank;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++)
            {
                if(i==1 || j==1 || i==n || j==n){
                
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //Number pyramid
      
        System.out.println("Number Pyramid\n");

        for(int i=1;i<=n;i++)
        {
        //spaces
        for(int j=1;j<=n-i;j++)
        {
            System.out.print("  ");
        }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+"  ");
            }
                    System.out.println();
        }

       // Pallindrome Pyramid

       System.out.println("Pallindrome Pyramid");
       
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+ " ");
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();

        }
       
        //Diamond Pattern
        System.out.println("Diamond Pattern\n");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print ("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    }

