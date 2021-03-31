package ht10Collections.part2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task9 {
    public static void main(String[] args) {
        Integer[] integer = new Integer[]{1, 2, 2, 3, 4, 4, 5, 1, 3, 3, 6, 9};
        System.out.println(Arrays.toString(integer));
        System.out.println(arrayToMap(integer));
    }

    private static <K> Map<K, Integer> arrayToMap(K[] array) {
        Map<K, Integer> map = new HashMap<>();
        for (K key : array) {
            map.compute(key, (v, counter) -> {
                if (counter == null) {
                    counter = 0;
                }
                counter++;
                return counter;
            });
        }
        return map;
    }
}
