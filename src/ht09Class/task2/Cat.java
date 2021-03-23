package ht09Class.task2;

public class Cat extends Animal {
    private String catSay = "meow-meow";

    @Override
    public void say() {
        System.out.println(catSay);
    }
}
