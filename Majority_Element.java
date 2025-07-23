    import java.util.*;
    public class Majority_Element {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.print("Enter the size of array: ");
            n=sc.nextInt();
            int [] arr = new int[n];
            int repeat=0;
            int count=0;
            System.out.print("Enter the Elements is Array:\t");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0; i<arr.length;i++){
                if(count==0){
                    repeat=arr[i];
                }
                if(repeat==arr[i]){
                    count++;
                }
                else{
                    count--;
                }
            }
                  int freq=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==repeat){
                    freq++;
                }
            }
            if(freq>arr.length/2){
                 System.out.println("Majority Element in this Array is: "+repeat);
            }else{
                System.out.println("No Majority Element found!!");
            }
           
        }
    }
