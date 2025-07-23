public class Remove_Element {
    public static void main(String[] args) {
        int val=2;
        int c=0;
        int[] arr ={3,2,2,3};
        int n = arr.length;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                c++;
            }
        }
        System.out.println(n-c);
    }
}
