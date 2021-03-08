package ht04Methods;

import static java.lang.Math.sqrt;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(simpleNumber(29));
    }

    private static boolean simpleNumber(int j) {

        for (int i = 2; i < sqrt(j); i++) {
            if (j % i == 0) {
                return false;
            }
        }
        return true;
    }
}
