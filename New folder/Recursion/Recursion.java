import java.util.*;

public class Recursion {


    static void rec(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        rec(n+1);

    }
    public static void main(String[] args) {
        rec(1);
    }
    
}
