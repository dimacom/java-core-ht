package ht09Class.task2;

public class App {
    public static void main(String[] args) {
        Animal[] animals = new Animal[10];
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal duck = new Duck();
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = duck;
        for (Animal animal : animals) {
            if (animal == null) continue;
            animal.say();
        }
    }
}
