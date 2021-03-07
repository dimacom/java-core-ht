package ht06String;

public class Task7 {

    public static void main(String[] args) {
        String string = "one two three four five six";
        String[] words = string.split(" ");
        String result = "";
        int bigSize = 0;
        for (String word : words) {
            if (word.length() > bigSize) {
                bigSize = word.length();
                result = word;
            }
        }
        System.out.println(result);
    }
}
