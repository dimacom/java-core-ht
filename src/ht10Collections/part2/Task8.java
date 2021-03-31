package ht10Collections.part2;


import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 2);
        numbers.put(2, 3);
        numbers.put(3, 2);
        numbers.put(4, 4);
        numbers.put(5, 5);
        System.out.println(reverseMap(numbers));
    }

    static <K, V> Map<V, Collection<K>> reverseMap(Map<K, V> map) {
        Map<V, Collection<K>> newMap = new HashMap<>();
        Set<K> keys = map.keySet();
        for (K key : keys) {
            V value = map.get(key);
            newMap.compute(value, (v, collection) -> {
                if (collection == null) {
                    collection = new HashSet<>();
                }
                collection.add(key);
                return collection;
            });
        }
        return newMap;
    }
}