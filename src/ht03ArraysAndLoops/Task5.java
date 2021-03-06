package ht03ArraysAndLoops;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == 2) {
                    matrix[i][j] = -1;
                    continue;
                }
                if (j == 3) {
                    matrix[i][j] = -1;
                    continue;
                }
                matrix[i][j] = random.nextInt(10);
            }
        }
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
