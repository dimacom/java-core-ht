package ht10Collections.part2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task11 {
    public static void main(String[] args) {
        String story = "Being  able to read a novel in another language and understand it is a huge achievement." +
                "You will feel accomplished the moment you read that final page, close the book, and reflect on" +
                "the experience. You might find yourself at the last page faster than you thought—once you begin" +
                "reading these books, you wont be able to put them down.";
        Set<String> setWords = new HashSet<>(Arrays.asList(story.toLowerCase().split("\\W+")));
        System.out.println(setWords);
    }
}
