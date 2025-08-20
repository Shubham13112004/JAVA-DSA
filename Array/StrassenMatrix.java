import java.util.*;
public class StrassenMatrix {


     public static int[][] strassen2x2(int[][]A,int[][]B){
        int[][] result = new int[2][2];

      
        int a=A[0][0], b=A[0][1];
        int c = A[1][0], d = A[1][1];

    
        int e = B[0][0], f = B[0][1];
        int g = B[1][0], h = B[1][1];

      
        int p1 = a * (f - h);
        int p2 = (a + b) * h;
        int p3 = (c + d) * e;
        int p4 = d * (g - e);
        int p5 = (a + d) * (e + h);
        int p6 = (b - d) * (g + h);
        int p7 = (a - c) * (e + f);

    
        result[0][0] = p5 + p4 - p2 + p6;
        result[0][1] = p1 + p2;
        result[1][0] = p3 + p4;
        result[1][1] = p1 + p5 - p3 - p7;

        return result;
    }


        public static void printMatrix(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
       
        int [][]A={
            {1,2},
            {3,4}
        };
        
        int [][]B={
            {5,6},
            {7,8}
        };

        int[][] result = strassen2x2(A, B);

        System.out.println("Result Matrix:");
        printMatrix(result);
    }


}

