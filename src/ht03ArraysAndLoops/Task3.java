package ht03ArraysAndLoops;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            x = random.nextInt(10);
            if (x % 2 == 0) array[i] = 0;
            if (x % 2 != 0) array[i] = 1;
        }
        System.out.println(Arrays.toString(array));
    }
}
