package ht10Collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> integers = new HashSet<>();
        while (integers.size() < 20) {
            integers.add(random.nextInt(50));
        }
        integers.removeIf(nextInteger -> nextInteger >= 10);
        System.out.println(integers.toString());
    }
}
