import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr={5,3,7,8,9,1};
        System.out.println(Arrays.toString(arr));
        int target=9;
        Arrays.sort(arr);

        int start=0;
        int end=arr.length-1;
        int mid=0;

        while(start<=end){
            mid=start+(end-start)/2;

            if(arr[mid]==target){
                System.out.println("Index of target found is: "+mid);
                break;

            }
            else if(target>arr[mid]){
                start=mid+1;
                
            }
            else{
                end= mid-1;
            }
     
        }

    }
}
