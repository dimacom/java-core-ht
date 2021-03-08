package ht04Methods;

import java.util.Arrays;

import static ht04Methods.Utils.completeArray;
import static ht04Methods.Utils.uniqueRandom;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uniqueRandom(completeArray(10))));
    }
}
