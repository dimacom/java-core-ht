package ht10Collections.part2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static ht10Collections.part2.Task8.reverseMap;

public class Task12 {

    public static void main(String[] args) {
        String story = "Being able to read a novel in another language and understand it is a huge achievement." +
                "You will feel accomplished the moment you read that final page, close the book, and reflect on" +
                "the experience. You might find yourself at the last page faster than you thought—once you begin" +
                "reading these books, you wont be able to put them down.";
        String[] storyOfWords = story.split("\\W+");
        Map<Integer, String> words = new HashMap<>();
        int counter = 0;
        for (String word : storyOfWords) {
            words.put(counter, word);
            counter++;
        }
        Map<String, Collection<Integer>> mapNew = reverseMap(words);
        Map<String, Integer> mapResult = new HashMap<>();
        for (Map.Entry<String, Collection<Integer>> entry : mapNew.entrySet()) {
            mapResult.put(entry.getKey(), entry.getValue().size());
        }
        System.out.println(mapResult);
    }
}
