package ht04Methods;

import java.util.Arrays;
import java.util.Random;

public class Utils {
    public static Random random = new Random();

    public static int[] completeArray(int i) {
        Random random = new Random();
        int[] array = new int[i];
        for (int j = 0; j < i; j++) {
            array[j] = random.nextInt(i);
        }
        return array;
    }

    public static int[] deleteElement(int[] array, int element) {
        int[] arrayNew = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != element) {
                arrayNew[j++] = array[i];
            }
        }
        return arrayNew;
    }

    public static int[] sortHalfUpHalfDown(int[] array) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (i > array.length / 2 && array[i] > array[j]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
                if (i < array.length / 2 && array[i] < array[j]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        return array;
    }

    public static int[] changeEvenAndOdd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) array[i] = 0;
            if (array[i] % 2 != 0) array[i] = 1;
        }
        return array;
    }

    public static int[][] completeMatrix(int line, int column) {
        Random random = new Random();
        int[][] matrix = new int[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = random.nextInt(line * column);
            }
        }
        return matrix;
    }

    public static void matrixToString(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static int[][] changeNumbers(int[][] matrix) {
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
            }
        }
        return matrix;
    }

    public static int[][] changeAllNumbers(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) matrix[i][j] = 0;
                if (i < j) matrix[i][j] = -1;
                if (i > j) matrix[i][j] = 11;
            }
        }
        return matrix;
    }

    public static int[] uniqueRandom(int[] array) {
        int sizeArray = array.length;
        int[] arr = new int[sizeArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Random rnd = new Random(System.nanoTime());
        for (int i = 0; i < arr.length; i++) {
            swap(arr, i, rnd.nextInt(arr.length));
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}