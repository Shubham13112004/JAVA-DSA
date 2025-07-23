import java.util.*;
public class Calculator {
    public static void main(String[] args)
    {
        // Basic Calculator

        Scanner sc = new Scanner(System.in);
      

    while (true) {
                
        System.out.print("Enter First Value ");
        int a=sc.nextInt();

        System.out.print("Enter Second Value ");
        int b=sc.nextInt();

        System.out.print("Enter Which Operation Do You Want To Perform\n");
        System.out.print("1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Division\n 5.Exit\n");
        int choice=sc.nextInt();
            
            switch (choice) {
                   case 1:
                    int add= a+b;
                    System.out.println("Addition is "+add);
                    break;
            
                   
                   case 2:
                    int Substraction= a-b;
                    System.out.println("Substraction is "+Substraction);
                    break;

                    case 3:
                    int Multiplication= a*b;
                    System.out.println("Multiplication is "+Multiplication);
                    break;

                    case 4:
                    if(b!=0){
                    int Division= a/b;
                    System.out.println("Divison is "+Division);
                    }
                    else{
                        System.out.println("You Cannot divide by Zero");
                    }
                    break;

                    case 5:
                    System.out.println("Exiting");
                    System.exit(0);

                default:
                System.out.println("INVALIDE");
                    break;
            }
        }

    }

    }

 