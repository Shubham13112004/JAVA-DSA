import java.util.*;
public class Lab_3 {
    static int calculate(int a,int b){
        return a+b;

    }

    static int calculate(int a,int b,int c){
        return (a+b+c)/2;
    }
    static double calculate(double a,double b){
        return a-b;
    }

    static float calculate(float t){
        return (float)Math.sin(Math.toRadians(t));
    }

    static int calculate(int l){
        return (int)Math.log(l);
    }

    static int[][] calculate(int nums[][]){
        int[][] arr = new int[3][3];
           for(int i = 0 ; i<3; i++){
            for(int j =0;j<3;j++){
               arr[i][j]=nums[i][j];
            }
            System.out.println();
         }
         return arr;

    }
    public static void main(String[] args) {

        System.out.println("-----------------------------------------");
        System.out.println("NAME:-SHUBHAM DESAI");
        System.out.println("RNo:-IT3109");
        System.out.println("------------------------------------------");  

        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers for addition: ");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.print("Addition is:");

        System.out.println(calculate(a,b));


        System.out.print("Enter numbers for Average: ");

         int c=input.nextInt();
         int d=input.nextInt();
         int e=input.nextInt();
        System.out.print("Average is :");
        System.out.println((calculate(c,d,e)));
       
                System.out.print("Enter two numbers for Subtraction: ");

         double f=input.nextDouble();
         
        double g=input.nextDouble();
         System.out.print("Subtraction is :");
        System.out.println(calculate(f,g));

                System.out.print("Enter number for Trignometric: ");

         float t=input.nextFloat();
         System.out.println(calculate(t));


        System.out.print("Enter number for Logarithmic: ");

         int l=input.nextInt();
         System.out.println(calculate(l));
          

                 System.out.print("Enter numbers for 2D matrix: ");

         int[][] arr = new int[3][3];

         for(int i = 0 ; i<3; i++){
            for(int j =0;j<3;j++){
                arr[i][j]=input.nextInt();
            }
         }

         System.out.println(Arrays.deepToString(arr));

    }
}