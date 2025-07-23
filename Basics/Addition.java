import java.util.Scanner;

public class Addition {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sum(a,b);
        sum1(a,b,c);
        }

         static void sum(int a,int b){
            System.out.println("Sum:");
            int ans=a+b;
            System.out.println(ans);

     }

     static void sum1(int a,int b,int c){
        System.out.println("Sum");
        System.out.println(a+b+c);
     }


    

}
