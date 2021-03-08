package ht04Methods;

public class Task4 {
    private static int counter;

    public static void main(String[] args) {
        func();
        func();
        func();
        System.out.println(counter);
    }

    private static void func() {
        counter++;
    }
}
