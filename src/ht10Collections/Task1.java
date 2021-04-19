package ht10Collections;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String[] wordsArray = new String[]{"long", "long", "lite", "look", "live", "lose", "life", "little", "letter", "lamp", "lift", "lott", "laugh", "like", "lost", "lamb", "list", "laser", "lotus", "lie", "lesson"};
        Set<String> wordsSet = new TreeSet<>(Arrays.asList(wordsArray));
        System.out.println(wordsSet.toString());
    }
}
