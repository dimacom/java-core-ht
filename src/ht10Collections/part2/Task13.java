package ht10Collections.part2;

import java.util.*;

public class Task13 {
    public static void main(String[] args) {
        String line1 = "a b d e p";
        String line2 = "a c d k f";
        String line3 = "a e f c p t";
        System.out.println(containWordsByLines(line1, line2, line3));
        System.out.println(containWordsOnlyLine1(line1, line2, line3));
        System.out.println(containWordsLine1ORLine2(line1, line2, line3));
    }

    private static Set<String> containWordsByLines(String line1, String line2, String line3) {
        Set<String> wordsContain = new HashSet<>();
        String doubleLine = line1 + " " + line2;
        for (String words1 : listByline(line3)) {
            for (String words2 : listByline(doubleLine)) {
                if (words1.equals(words2)) {
                    wordsContain.add(words1);
                }
            }
        }
        return wordsContain;
    }

    private static Set<String> containWordsOnlyLine1(String line1, String line2, String line3) {
        Set<String> wordsContainLine1Only = new HashSet<>();
        for (String words1 : listByline(line3)) {
            if (listByline(line1).contains(words1) && !listByline(line2).contains(words1)) {
                wordsContainLine1Only.add(words1);
            }
        }
        return wordsContainLine1Only;
    }

    private static Set<String> containWordsLine1ORLine2(String line1, String line2, String line3) {
        Set<String> wordsContainLine1Only = new HashSet<>();
        for (String words1 : listByline(line3)) {
            if (listByline(line1).contains(words1) || listByline(line2).contains(words1)) {
                wordsContainLine1Only.add(words1);
            }
        }
        return wordsContainLine1Only;
    }

    private static List<String> listByline(String line) {
        return new ArrayList<>(Arrays.asList(line.toLowerCase().split("\\W+")));
    }
}
