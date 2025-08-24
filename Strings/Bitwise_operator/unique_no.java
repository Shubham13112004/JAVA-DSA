public class unique_no {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,5,3,2};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
        int unique=0;
        for(int i=0;i<arr.length;i++){
            unique=unique^arr[i];
        }
        return unique;
    }
}
