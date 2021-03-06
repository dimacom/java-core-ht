package ht06String;

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {

        String string = "I'm gonna make a change of once in my life it's gonna feel real good gonna make a difference";
        String[] words = string.split(" ");
        int maxLength = 0;
        String allLongWords = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength) maxLength = words[i].length();
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == maxLength) allLongWords += words[i] + " ";
        }
        String[] arrayAllLongWords = allLongWords.split(" ");
        Arrays.sort(arrayAllLongWords);

        System.out.println(arrayAllLongWords[0]);
    }
}
