package ht10Collections.part2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task7 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList("арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "женьшень", "земляника", "ирис", "картофель"));
        System.out.println(set);
    }
}
