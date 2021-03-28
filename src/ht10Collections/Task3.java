package ht10Collections;

import ht10Collections.person.Person;

import java.util.Map;

public class Task3 {
    public static void findPeople(String lastNameOrName, Map<Integer, Person> people) {
        int counterFind = 0;
        for (Person person : people.values()) {
            if (person.getLastName().equals(lastNameOrName) || person.getName().equals(lastNameOrName)) {
                System.out.println("find " + person);
                counterFind++;
            }
        }
        if (counterFind == 0) {
            System.err.printf("can't find person %s \n", lastNameOrName);
        }
    }

    public static void findPeople(String lastName, String name, Map<Integer, Person> people) {
        int counterFind = 0;
        for (Person person : people.values()) {
            if (person.getLastName().equals(lastName) && person.getName().equals(name)) {
                System.out.println("find " + person);
                counterFind++;
            }
        }
        if (counterFind == 0) {
            System.err.printf("can't find person %s %s \n", name, lastName);
        }
    }
}
