package ht03ArraysAndLoops;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        int counter = 1;
        for (int i = 0; i < array.length; i++, counter++) {
            if (counter % 3 != 0) {
                array[i] = random.nextInt(10);
            } else {
                array[i] = 3;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
