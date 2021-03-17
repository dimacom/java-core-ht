package ht09Class.task2;

public class Dog extends Animal {
    private String dogSay = "bark - bark";
    @Override
    public void say() {
        System.out.println(dogSay);
    }
}
