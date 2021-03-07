package ht06String;

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {

        String string = "I'm gonna make a change of once in my life it's gonna feel real good gonna make a difference";
        String[] words = string.split(" ");
        int maxLength = 0;
        StringBuilder allLongWords = new StringBuilder();
        for (String word : words) {
            if (word.length() > maxLength) maxLength = word.length();
        }
        for (String word : words) {
            if (word.length() == maxLength) allLongWords.append(word).append(" ");
        }
        String[] arrayAllLongWords = allLongWords.toString().split(" ");
        Arrays.sort(arrayAllLongWords);

        System.out.println(arrayAllLongWords[0]);
    }
}
