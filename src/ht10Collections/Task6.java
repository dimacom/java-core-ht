package ht10Collections;

import ht10Collections.person.Person;
import java.util.Map;

public class Task6 {
    public static void deletePeopleIfLittleSalary(Map<Integer, Person> people) {
        people.values().removeIf(next -> next.getSalary() < 500);
        for (Map.Entry<Integer, Person> personEntry : people.entrySet()) {
            System.out.println(personEntry);
        }
    }
}
