import java.util.*;
public class Fabbinoccci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prev = 0;
        int curr = 1;
        int next=0;
        for(int i=2;i<=10;i++){
            next = prev+curr;
            prev=curr;
            curr=next;
        }
        System.out.println(next);
        sc.close();
    }
}