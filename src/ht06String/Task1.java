package ht06String;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        String string = "brother mother";
        String[] words = string.split(" +");
        Arrays.sort(words);
        System.out.println(words[0]);
    }
}

