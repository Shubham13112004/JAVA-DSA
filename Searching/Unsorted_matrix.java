import java.util.Arrays;

public class Unsorted_matrix {

    static int [] search(int[][]arr,int target){

          for (int r = 0; r < arr.length; r++) {
        for (int c = 0; c < arr[0].length; c++) {
            if (arr[r][c] == target) {
                return new int[]{r, c};
            }
        }
    }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
           int[][] matrix = {
            {1,45,65,4},
            {51,69,7,22},
            {9,50,44,11},
            {32,45,54,67}
        };

        System.out.println(Arrays.toString(search(matrix,10)));

    }
}
