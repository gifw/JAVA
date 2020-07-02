package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
       int a = input.nextInt();
        int[][] matrix = new int[a][a];
   for (int i = 0; i < matrix.length; i++) {
       System.out.println("enter string " + i);
       for (int j = 0; j < matrix[i].length; j++) {
           matrix[i][j] = input.nextInt();
       }
   }
       int[] arrSumRows = new int[matrix.length];
        int[] arrSumColumns = new int[matrix.length];
        int digSum1 = 0;
        int digSum2 = 0;
        for (int i = 0; i < matrix.length;i++){
            int rowSum = 0;
            int columnSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
                columnSum += matrix[j][i];
                if (i == j) {
                    digSum1 += matrix[i][j];
                }
                if (i+j == matrix[i].length-1) {
                        digSum2 += matrix[i][j];
                }
            }
            arrSumRows[i] = rowSum;
            arrSumColumns[i] = columnSum;
        }
        int[] both = Arrays.copyOf(arrSumRows, arrSumRows.length + arrSumColumns.length);
        System.arraycopy(arrSumColumns, 0, both, arrSumRows.length, arrSumColumns.length);
        int[]newArray = Arrays.copyOf(both, both.length + 2);
        newArray[newArray.length - 2]= digSum1;
        newArray[newArray.length - 1]= digSum2;
        System.out.println(Arrays.toString(newArray));
        System.out.println("magic square: " + MatrixHelper.isMagic(newArray));
    }


}
