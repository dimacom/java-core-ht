package ht10Collections;


import ht10Collections.person.Person;
import java.util.Map;

public class Task5 {
    public static void deletePersonDuplicateName(Map<Integer, Person> people) {

        people.values().removeIf(p -> containDuplicate(people,p)>1);
        for (Map.Entry<Integer, Person> personEntry : people.entrySet()) {
            System.out.println(personEntry);
        }
    }

    private static int containDuplicate(Map<Integer, Person> people,Person person) {
        int counter = 0;
        for (Person value : people.values()) {
            if(value.compareTo(person) == 0)counter++;
        }
        return counter;
    }
}



