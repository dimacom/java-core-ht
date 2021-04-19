package ht10Collections.part2;

import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(numbers);
        multiplyAllElementBySet(halfMultiplySet(numbers));
    }

    private static void multiplyAllElementBySet(Set<Integer> set) {
        LinkedHashSet<Integer> newSet;
        newSet = (LinkedHashSet<Integer>) halfMultiplySet(set);
        do newSet = (LinkedHashSet<Integer>) halfMultiplySet(newSet);
        while (newSet.size() > 1);
    }

    private static Set<Integer> halfMultiplySet(Set<Integer> set) {
        if (set.size() % 2 != 0) set.add(0);
        int counter = 0;
        Set<Integer> newSet = new LinkedHashSet<>();
        int doubleValue = 0;
        for (Integer integer : set) {
            if (counter < 2) {
                counter++;
                doubleValue = doubleValue + integer;
                if (counter == 2) {
                    newSet.add(doubleValue);
                    doubleValue = 0;
                    counter = 0;
                }
            }
        }
        System.out.println(newSet);
        return newSet;
    }
}

