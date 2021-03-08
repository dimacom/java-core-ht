package ht04Methods;

import java.util.Arrays;
import static ht04Methods.Utils.completeArray;
import static ht04Methods.Utils.deleteElement;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteElement(completeArray(5), 3)));
    }
}

