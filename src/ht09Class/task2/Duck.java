package ht09Class.task2;

public class Duck extends Animal {
    private String duckSay = "quack-quack";

    @Override
    public void say() {
        System.out.println(duckSay);
    }
}
