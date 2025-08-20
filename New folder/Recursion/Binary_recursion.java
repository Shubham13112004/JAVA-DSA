public class Binary_recursion {
      static int Binary(int [] arr, int s,int e,int target){

          if(s>e){
              return -1;
        }
      

        int mid = s+(e-s)/2;

        if(target == arr[mid]){
            return mid;
        }
        else if(target<arr[mid]){

            return Binary(arr, s, mid-1, target);
        }
        else{
            return Binary(arr, mid+1, e, target);
        }

      

    }
    public static void main(String[] args) {
        int [] nums = {2,4,7,9,10,12};
        int s=0;
        int n = nums.length-1;

        int ans = Binary(nums,s,n,12);
       System.out.println(ans);
       
    }
  
}






