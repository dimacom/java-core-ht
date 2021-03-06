package ht03ArraysAndLoops;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int size = 10;
        Random random = new Random();
        int[] array = new int[size];
        int[] arrayNew = new int[size - 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != 4) {
                arrayNew[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayNew));
    }
}
