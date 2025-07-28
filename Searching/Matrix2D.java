import java.util.*;
public class Matrix2D{

     static int[] search(int[][] arr,int target){
            int r = 0;
            int c = arr.length-1;

            while(r<arr.length && c >=0){
                if(arr[r][c]==target){
                    return new int[] {r,c};
                }
                if(arr[r][c]<target){
                    r++;
                }else{
                    c--;
                }
            }
            return new int[]{-1,-1};
        }
    public static void main(String[] args){
       
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,0,44,11},
            {32,45,54,67}
        };

        System.out.println(Arrays.toString(search(matrix,67)));

    }


}