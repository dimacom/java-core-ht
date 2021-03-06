package ht03ArraysAndLoops;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) matrix[i][j] = 0;
                if (i < j) matrix[i][j] = -1;
                if (i > j) matrix[i][j] = 11;
            }
        }
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
