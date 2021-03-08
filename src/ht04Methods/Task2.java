package ht04Methods;

public class Task2 {
    public static void main(String[] args) {
        number(4);
    }

    private static void number(int i) {
        for (int j = 1; j < i+1; j++) {
            for (int k = 0; k < j; k++) {
                System.out.print(j);
            }
        }
    }
}
