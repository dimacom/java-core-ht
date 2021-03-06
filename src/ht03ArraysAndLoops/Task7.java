package ht03ArraysAndLoops;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int[] array ;
           array = uniqueRandom(10);
            System.out.println(Arrays.toString(array));
    }

    static int[] uniqueRandom(int sizeArray) {
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

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}





