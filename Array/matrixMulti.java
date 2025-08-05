import java.util.*;
public class matrixMulti{
    public static void main(String[] args) {
        // m=2 n=3
        int [][] A ={
            {1,2,3},
            {4,5,6}
        };
        //m=3 n=2
        int [][] B ={
            {7,8},
            {9,10},
            {11,12}
        };

        int m=A.length;
        int n=A[0].length;
        int p=B[0].length;

        int[][] result = new int[m][p];
        for(int i=0;i<m;i++){
            for(int j=0;j<p;j++){
                for(int k=0;k<n;k++){
                    result[i][j] += A[i][k]*B[k][j];
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<p;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}