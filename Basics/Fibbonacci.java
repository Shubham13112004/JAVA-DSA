public class Fibbonacci {
    public static void main(String[] args){
        int c=0;
        int a =0;
        int b=1;
        System.out.print(a+" "+b);
        for(int i=2;i<=10;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }
    }
}
